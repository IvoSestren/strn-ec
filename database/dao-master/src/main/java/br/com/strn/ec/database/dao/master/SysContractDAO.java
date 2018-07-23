package br.com.strn.ec.database.dao.master;

import br.com.strn.ec.database.connection.hibernate.DbMaster;
import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.master.SysContract;
import org.hibernate.Session;

import javax.inject.Inject;

public class SysContractDAO extends GenericDAO<SysContract> {

    /**
     * @deprecated CDI eyes only
     */
    @Deprecated
    protected SysContractDAO() {
        this(null);
    }

    @Inject
    public SysContractDAO(@DbMaster Session session) {
        super(session);
    }
}
