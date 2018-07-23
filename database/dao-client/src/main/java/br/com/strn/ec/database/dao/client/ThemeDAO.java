package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Theme;
import org.hibernate.Session;

import javax.inject.Inject;

public class ThemeDAO extends GenericDAO<Theme> {

    /**
     * @deprecated CDI eyes only
     */
    protected ThemeDAO() {
        this(null);
    }

    @Inject
    public ThemeDAO(Session session) {
        super(session);
    }
}
