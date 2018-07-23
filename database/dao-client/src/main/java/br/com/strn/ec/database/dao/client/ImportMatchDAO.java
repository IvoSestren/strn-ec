package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.ImportMatch;
import org.hibernate.Session;

import javax.inject.Inject;

public class ImportMatchDAO extends GenericDAO<ImportMatch> {

    /**
     * @deprecated CDI eyes only
     */
    protected ImportMatchDAO() {
        this(null);
    }

    @Inject
    public ImportMatchDAO(Session session) {
        super(session);
    }
}