package br.com.strn.ec.util.domain;

import br.com.caelum.vraptor.http.MutableRequest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class DefaultDomain implements Domain {

    private final MutableRequest request;

    /**
     * @deprecated CDI eyes only
     */
    protected DefaultDomain() {
        this(null);
    }

    @Inject
    public DefaultDomain(MutableRequest request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return this.name();
    }

    @Override
    public String name() {
        return request.getServerName().toLowerCase();
    }
}
