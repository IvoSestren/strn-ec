package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.GroupLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class GroupLangDAO extends GenericDAO<GroupLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected GroupLangDAO() {
        this(null);
    }

    @Inject
    public GroupLangDAO(Session session) {
        super(session);
    }
}