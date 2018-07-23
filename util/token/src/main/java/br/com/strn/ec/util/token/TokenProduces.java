package br.com.strn.ec.util.token;

import br.com.caelum.vraptor.http.MutableRequest;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class TokenProduces {

    private final MutableRequest request;

    /**
     * @deprecated CDI eyes only
     */
    protected TokenProduces() {
        this(null);
    }

    @Inject
    public TokenProduces(MutableRequest request) {
        this.request = request;
    }

    @Produces
    @RequestScoped
    public Token create() {
        return TokenUtil.fromString(request.getHeader("Authorization"));
    }
}
