package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.FeatureValueLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class FeatureValueLangDAO extends GenericDAO<FeatureValueLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected FeatureValueLangDAO() {
        this(null);
    }

    @Inject
    public FeatureValueLangDAO(Session session) {
        super(session);
    }
}