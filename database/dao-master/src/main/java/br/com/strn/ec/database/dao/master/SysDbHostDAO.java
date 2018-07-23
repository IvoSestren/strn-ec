package br.com.strn.ec.database.dao.master;

import br.com.strn.ec.database.connection.hibernate.DbMaster;
import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.master.SysDbHost;
import org.hibernate.Session;

import javax.inject.Inject;

public class SysDbHostDAO extends GenericDAO<SysDbHost> {

    /**
     * @deprecated CDI eyes only
     */
    @Deprecated
    protected SysDbHostDAO() {
        this(null);
    }

    @Inject
    public SysDbHostDAO(@DbMaster Session session) {
        super(session);
    }
}
