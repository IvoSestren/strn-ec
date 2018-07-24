package br.com.strn.ec.database.producer.entities.master;

import br.com.strn.ec.database.dao.master.SysUrlDAO;
import br.com.strn.ec.database.entities.master.SysUrl;
import br.com.strn.ec.util.domain.Domain;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import java.util.List;

public class SysUrlCreator {

    private final SysUrlDAO sysUrlDAO;
    private final Domain domain;

    /**
     * @deprecated CDI eyes only
     */
    protected SysUrlCreator() {
        this(null, null);
    }

    @Inject
    public SysUrlCreator(SysUrlDAO sysUrlDAO, Domain domain) {
        this.sysUrlDAO = sysUrlDAO;
        this.domain = domain;
    }

    @Produces
    @RequestScoped
    public SysUrl create() {
        List<SysUrl> sysUrls = sysUrlDAO.findByUrl(domain.name());

        if (sysUrls == null || sysUrls.size() <= 0)
            throw new RuntimeException("SysUrl for url " + domain.name() + " not found.");

        return sysUrls.get(0);
    }
}
