package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.AttachmentLang;
import org.hibernate.Session;

import javax.inject.Inject;

public class AttachmentLangDAO extends GenericDAO<AttachmentLang> {

    /**
     * @deprecated CDI eyes only
     */
    protected AttachmentLangDAO() {
        this(null);
    }

    @Inject
    public AttachmentLangDAO(Session session) {
        super(session);
    }
}