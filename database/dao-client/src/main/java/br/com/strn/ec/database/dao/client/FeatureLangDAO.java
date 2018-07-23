package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.FeatureLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class FeatureLangDAO extends GenericDAO<FeatureLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected FeatureLangDAO() {
        this(null);
    }

    @Inject
    public FeatureLangDAO(Session session) {
        super(session);
    }
}