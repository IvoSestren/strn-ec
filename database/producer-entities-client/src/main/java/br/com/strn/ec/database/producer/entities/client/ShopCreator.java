package br.com.strn.ec.database.producer.entities.client;

import br.com.strn.ec.database.dao.client.ShopDAO;
import br.com.strn.ec.database.entities.client.Shop;
import br.com.strn.ec.database.entities.master.SysUrl;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class ShopCreator {

    private final SysUrl sysUrl;
    private final ShopDAO shopDAO;

    /**
     * @deprecated CDI eyes only
     */
    protected ShopCreator() {
        this(null, null);
    }

    @Inject
    public ShopCreator(SysUrl sysUrl, ShopDAO shopDAO) {
        this.sysUrl = sysUrl;
        this.shopDAO = shopDAO;
    }

    @Produces
    @RequestScoped
    public Shop create() {
        String idShop = sysUrl.getIdShop();
        Shop shop = shopDAO.findById(idShop);

        if (shop == null)
            throw new RuntimeException("Shop " + idShop + " not found");

        return shop;
    }
}
