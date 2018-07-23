package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Attachment;
import org.hibernate.Session;

import javax.inject.Inject;

public class AttachmentDAO extends GenericDAO<Attachment> {

    /**
     * @deprecated CDI eyes only
     */
    protected AttachmentDAO() {
        this(null);
    }

    @Inject
    public AttachmentDAO(Session session) {
        super(session);
    }
}