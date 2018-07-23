package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Translation;
import org.hibernate.Session;

import javax.inject.Inject;

public class TranslationDAO extends GenericDAO<Translation> {

    /**
     * @deprecated CDI eyes only
     */
    protected TranslationDAO() {
        this(null);
    }

    @Inject
    public TranslationDAO(Session session) {
        super(session);
    }
}