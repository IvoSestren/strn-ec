package br.com.strn.ec.database.connection.domain;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class Domains {

    private List<DomainSchema> domainSchemas;

    public Domains() {
    }

    @PostConstruct
    public void constructor() {
        domainSchemas = new ArrayList<>();
    }

    public List<DomainSchema> getDomainSchemas() {
        return domainSchemas;
    }

    public DomainSchema getFromDomain(String domain) {
        for (DomainSchema domainSchema : domainSchemas) {
            if (domainSchema.getDomain().equals(domain)) {
                return domainSchema;
            }
        }

        return null;
    }
}
