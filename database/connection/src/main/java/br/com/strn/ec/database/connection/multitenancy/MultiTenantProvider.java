package br.com.strn.ec.database.connection.multitenancy;

import com.zaxxer.hikari.hibernate.HikariConnectionProvider;
import org.hibernate.HibernateException;
import org.hibernate.engine.config.spi.ConfigurationService;
import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider;
import org.hibernate.service.spi.ServiceRegistryAwareService;
import org.hibernate.service.spi.ServiceRegistryImplementor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

@SuppressWarnings("SqlNoDataSourceInspection")
public class MultiTenantProvider implements MultiTenantConnectionProvider, ServiceRegistryAwareService {

    private HikariConnectionProvider connectionProvider = null;

    @Override
    public Connection getAnyConnection() throws SQLException {
        return connectionProvider.getConnection();
    }

    @Override
    public void releaseAnyConnection(Connection connection) throws SQLException {
//        try {
//            connection.createStatement().execute("SET SCHEMA 'public'");
//            connection.createStatement().execute("SET application_name = 'STRN eCommerce (public)'");
//        } catch (SQLException e) {
//            throw new HibernateException("Could not alter JDBC connection to specified schema [public]", e);
//        }

        connectionProvider.closeConnection(connection);
    }

    @Override
    public Connection getConnection(String tenantIdentifier) throws SQLException {
        final Connection connection = getAnyConnection();
        try {
            String sql;
            if ("public".equals(tenantIdentifier)) {
                sql = "SET SEARCH_PATH TO 'public'";
            } else {
                sql = "SET SEARCH_PATH TO '" + tenantIdentifier + "', 'public'";
            }
            connection.createStatement().execute(sql);
            connection.createStatement().execute("SET application_name = 'STRN eCommerce (" + tenantIdentifier + ")'");
        } catch (SQLException e) {
            throw new HibernateException("Could not alter JDBC connection to specified schema [" + tenantIdentifier + "]", e);
        }
        return connection;
    }

    @Override
    public void releaseConnection(String tenantIdentifier, Connection connection) throws SQLException {
        releaseAnyConnection(connection);
    }

    @Override
    public boolean supportsAggressiveRelease() {
        return false;
    }

    @Override
    public void injectServices(ServiceRegistryImplementor serviceRegistry) {
        Map lSettings = serviceRegistry.getService(ConfigurationService.class).getSettings();

        connectionProvider = new HikariConnectionProvider();
        connectionProvider.configure(lSettings);
    }

    @Override
    public boolean isUnwrappableAs(Class unwrapType) {
        return false;
    }

    @Override
    public <T> T unwrap(Class<T> unwrapType) {
        return null;
    }
}
