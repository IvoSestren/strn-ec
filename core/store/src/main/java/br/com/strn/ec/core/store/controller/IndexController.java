package br.com.strn.ec.core.store.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.strn.ec.util.thymeleaf.ThymeleafResult;

import javax.inject.Inject;

@Controller
@Path("/")
public class IndexController {

    private final Result result;

    /**
     * @deprecated CDI eyes only.
     */
    protected IndexController() {
        this(null);
    }

    @Inject
    public IndexController(Result result) {
        this.result = result;
    }

    @Get
    @Path("/")
    public void index() {
        result.use(ThymeleafResult.class).templateFile("index.html").render();
    }
}
