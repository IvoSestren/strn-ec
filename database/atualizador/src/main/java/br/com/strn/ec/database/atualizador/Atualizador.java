package br.com.strn.ec.database.atualizador;

import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.*;

class Atualizador {

    private static final String PREFIX = "db.migration";
    private static Logger LOGGER = LoggerFactory.getLogger(Atualizador.class);

    private final String url;
    private final String user;
    private final String password;
    private final DataSource dataSource;
    private final String type;

    Atualizador(String type, String url, String user, String password) {
        this.type = type;
        this.url = url;
        this.user = user;
        this.password = password;
        this.dataSource = null;
    }

    void atualizar() {
        master();
        cliente();
    }

    private void master() {
        Flyway flyway = new Flyway();

        if (this.dataSource != null) {
            flyway.setDataSource(dataSource);
        } else {
            assert url != null;
            flyway.setDataSource(url, user, password, "");
        }

        flyway.setLocations(PREFIX + "." + type + ".master");

        flyway.setValidateOnMigrate(false);

        flyway.migrate();
    }

    private void cliente() {
        if (dataSource != null) {
            try (Connection conn = dataSource.getConnection()) {
                getSchemas(conn);
            } catch (SQLException e) {
                LOGGER.error(e.getMessage());
            }
        } else {
            assert url != null;
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                getSchemas(conn);
            } catch (SQLException e) {
                LOGGER.error(e.getMessage());
            }
        }
    }

    @SuppressWarnings("SqlResolve")
    private void getSchemas(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            String sql = "SELECT DISTINCT a.schema FROM sysdbschema a";

            try (ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    execClienteMigration(
                            rs.getString("schema")
                    );
                }
            }
        }
    }

    private void execClienteMigration(String schema) {
        Flyway flyway = new Flyway();
        if (dataSource != null) {
            flyway.setDataSource(dataSource);
        } else {
            assert url != null;
            flyway.setDataSource(url, user, password, "");
        }

        flyway.setLocations(PREFIX + "." + type + ".client");
        flyway.setSchemas(schema);
        flyway.setValidateOnMigrate(false);

        //flyway.clean();

        flyway.migrate();
    }
}
