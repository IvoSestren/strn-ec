package br.com.strn.ec.database.dao.master;

import br.com.strn.ec.database.connection.hibernate.DbMaster;
import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.master.SysClient;
import org.hibernate.Session;

import javax.inject.Inject;

public class SysClientDAO extends GenericDAO<SysClient> {

    /**
     * @deprecated CDI eyes only
     */
    @Deprecated
    protected SysClientDAO() {
        this(null);
    }

    @Inject
    public SysClientDAO(@DbMaster Session session) {
        super(session);
    }
}
