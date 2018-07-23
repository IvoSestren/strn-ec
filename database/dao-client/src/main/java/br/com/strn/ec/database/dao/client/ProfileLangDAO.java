package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ProfileLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class ProfileLangDAO extends GenericDAO<ProfileLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected ProfileLangDAO() {
        this(null);
    }

    @Inject
    public ProfileLangDAO(Session session) {
        super(session);
    }
}