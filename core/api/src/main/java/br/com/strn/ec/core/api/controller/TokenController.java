package br.com.strn.ec.core.api.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.strn.ec.util.genid.GenId;
import br.com.strn.ec.util.token.Token;
import br.com.strn.ec.util.token.TokenUtil;

import javax.inject.Inject;

@Controller
@Path("/token")
public class TokenController {

    private final Result result;

    protected TokenController() {
        this(null);
    }

    @Inject
    public TokenController(Result result) {
        this.result = result;
    }

    @Get
    @Path("/")
    public void index() {
        Token token = new Token();
        token.setIdStore(GenId.generate());
        result.use(Results.http()).body(TokenUtil.toString(token));
    }
}
