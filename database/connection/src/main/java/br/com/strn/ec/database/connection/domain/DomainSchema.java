package br.com.strn.ec.database.connection.domain;

public class DomainSchema {

    private String domain;
    private String schema;

    public DomainSchema(String domain, String schema) {
        this.domain = domain;
        this.schema = schema;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}
