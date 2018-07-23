package br.com.strn.ec.database.dao.master;

import br.com.strn.ec.database.connection.hibernate.DbMaster;
import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.master.SysDbDatabase;
import org.hibernate.Session;

import javax.inject.Inject;

public class SysDbDatabaseDAO extends GenericDAO<SysDbDatabase> {

    /**
     * @deprecated CDI eyes only
     */
    @Deprecated
    protected SysDbDatabaseDAO() {
        this(null);
    }

    @Inject
    public SysDbDatabaseDAO(@DbMaster Session session) {
        super(session);
    }
}
