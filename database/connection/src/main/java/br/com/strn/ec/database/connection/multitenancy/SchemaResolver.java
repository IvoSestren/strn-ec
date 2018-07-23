package br.com.strn.ec.database.connection.multitenancy;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;

public class SchemaResolver implements CurrentTenantIdentifierResolver {

    @Override
    public String resolveCurrentTenantIdentifier() {
        return "master"; //TODO: Implement service to identify tenant like: userService.getCurrentlyAuthUser().getTenantId();
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return false;
    }
}
