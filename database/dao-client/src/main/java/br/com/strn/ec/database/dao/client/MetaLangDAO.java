package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.MetaLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class MetaLangDAO extends GenericDAO<MetaLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected MetaLangDAO() {
        this(null);
    }

    @Inject
    public MetaLangDAO(Session session) {
        super(session);
    }
}