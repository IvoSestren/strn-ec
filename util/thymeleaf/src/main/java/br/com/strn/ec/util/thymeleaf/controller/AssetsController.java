package br.com.strn.ec.util.thymeleaf.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.observer.download.Download;
import br.com.caelum.vraptor.observer.download.DownloadBuilder;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileNotFoundException;

@Controller
public class AssetsController {

    private final Result result;
    private final ServletContext context;

    /**
     * @deprecated CDI eyes only
     */
    protected AssetsController() {
        this(null, null);
    }

    @Inject
    public AssetsController(Result result, ServletContext context) {
        this.result = result;
        this.context = context;
    }

    @Get
    @Path(value = "/{filename*}", priority = Path.LOWEST)
    public Download index(String filename) {
        try {
            if (filename != null) {
                if (filename.endsWith(".html") /*|| filename.endsWith(".css") || filename.endsWith(".js")*/) {
                    result.notFound();
                    //result.use(ThymeleafResult.class).templateFile(filename).render();
                } else {
                    return resultTemplateFile(filename);
                }
            } else {
                result.notFound();
            }
            return null;
        } catch (FileNotFoundException e) {
            result.notFound();
        }
        return null;
    }

    private Download resultTemplateFile(String filename) throws FileNotFoundException {
        String serverPath = context.getRealPath("/");

        String diretorios[] = {
                "c:/temp/teste/",
                serverPath + "/WEB-INF/templates/default/"
        };

        for (String diretorio : diretorios) {
            String file = diretorio + filename;

            File arq = new File(file);
            if (arq.exists() && arq.isFile()) {
                try {
                    return DownloadBuilder.of(arq).downloadable().build();
                } catch (FileNotFoundException ignored) {
                }
            }
        }

        result.notFound();

        throw new FileNotFoundException("Erro ao pegar o asset: " + filename);
    }
}
