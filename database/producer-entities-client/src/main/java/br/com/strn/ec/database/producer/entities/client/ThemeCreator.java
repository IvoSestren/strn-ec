package br.com.strn.ec.database.producer.entities.client;

import br.com.strn.ec.database.entities.client.Shop;
import br.com.strn.ec.database.entities.client.Theme;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class ThemeCreator {

    private final Shop shop;

    /**
     * @deprecated CDI eyes only.
     */
    protected ThemeCreator() {
        this(null);
    }

    @Inject
    public ThemeCreator(Shop shop) {
        this.shop = shop;
    }

    @Produces
    @RequestScoped
    public Theme create() {
        return shop.getTheme();
    }
}
