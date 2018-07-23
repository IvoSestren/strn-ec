package br.com.strn.ec.database.dao.master;

import br.com.strn.ec.database.connection.hibernate.DbMaster;
import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.master.SysUrl;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.inject.Inject;
import java.util.List;

public class SysUrlDAO extends GenericDAO<SysUrl> {

    /**
     * @deprecated CDI eyes only
     */
    protected SysUrlDAO() {
        this(null);
    }

    @Inject
    public SysUrlDAO(@DbMaster Session session) {
        super(session);
    }

    @SuppressWarnings({"unchecked", "SqlResolve"})
    public List<SysUrl> findByUrl(String url) {
        Query<SysUrl> q = session.createNativeQuery("SELECT a.* FROM sysurl a WHERE SUBSTRING(:url FROM a.url) <> ''", SysUrl.class);
        q.setParameter("url", url);
        return q.getResultList();
    }
}
