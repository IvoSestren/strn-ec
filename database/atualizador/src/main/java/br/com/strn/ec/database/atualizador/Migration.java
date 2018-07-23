package br.com.strn.ec.database.atualizador;

import br.com.strn.ec.util.genid.GenId;
import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class Migration implements JdbcMigration {

    protected Connection conn;

    @Override
    public final void migrate(Connection connection) throws Exception {
        this.conn = connection;

        run();
    }

    protected final String nextVal() {
        return GenId.generate();
    }

    protected final void createSequence(String sequenceName) throws SQLException {
        String sql = String.format("CREATE SEQUENCE %s", sequenceName);
        this.conn.prepareStatement(sql).executeUpdate();
    }

    protected final void createTable(String sql) throws SQLException {
        this.conn.prepareStatement(sql).executeUpdate();
    }

    protected final void createSchema(String schema) throws SQLException {
        String sql = String.format("CREATE SCHEMA IF NOT EXISTS %s", schema);
        this.conn.prepareStatement(sql).executeUpdate();
    }

    public abstract void run() throws Exception;
}
