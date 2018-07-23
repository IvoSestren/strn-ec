package br.com.strn.ec.database.dao.master;

import br.com.strn.ec.database.connection.hibernate.DbMaster;
import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.master.SysDbSchema;
import org.hibernate.Session;

import javax.inject.Inject;

public class SysDbSchemaDAO extends GenericDAO<SysDbSchema> {

    /**
     * @deprecated CDI eyes only
     */
    @Deprecated
    protected SysDbSchemaDAO() {
        this(null);
    }

    @Inject
    public SysDbSchemaDAO(@DbMaster Session session) {
        super(session);
    }
}
