package br.com.strn.ec.database.atualizador;

import br.com.caelum.vraptor.environment.Environment;
import br.com.caelum.vraptor.events.VRaptorInitialized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

@SuppressWarnings("unused")
public class VRaptorInit {

    private static Logger LOGGER = LoggerFactory.getLogger(VRaptorInit.class);
    private final Environment environment;

    /**
     * @deprecated CDI eyes only
     */
    protected VRaptorInit() {
        this(null);
    }

    @Inject
    public VRaptorInit(Environment environment) {
        this.environment = environment;
    }

    public void init(@Observes VRaptorInitialized vraptor) {
        String type = environment.get("banco.type", "postgresql");
        String host = environment.get("banco.host", "localhost");
        String port = environment.get("banco.port", "5432");
        String name = environment.get("banco.name");
        String user = environment.get("banco.user");
        String pass = environment.get("banco.pass");

        String url = "jdbc:" + type + "://" + host + ":" + port + "/" + name + "?ApplicationName=STRN eCommerce Atualizador";
        Atualizador atualizador = new Atualizador(type, url, user, pass);
        atualizador.atualizar();
    }
}
