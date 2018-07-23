package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.AttributeGroupLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class AttributeGroupLangDAO extends GenericDAO<AttributeGroupLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected AttributeGroupLangDAO() {
        this(null);
    }

    @Inject
    public AttributeGroupLangDAO(Session session) {
        super(session);
    }
}