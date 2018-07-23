package br.com.strn.ec.database.dao;

import org.hibernate.Session;

import javax.annotation.PostConstruct;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class GenericDAO<T> {

    protected final Session session;

    private Class classe;

    /**
     * @deprecated CDI eyes only.
     */
    protected GenericDAO() {
        this(null);
    }

    public GenericDAO(Session session) {
        this.session = session;
    }

    @SuppressWarnings("unchecked")
    @PostConstruct
    protected void postConstruct() {
        this.classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return session.createQuery("SELECT c FROM " + classe.getName() + " c").getResultList();
    }

    @SuppressWarnings("unchecked")
    public T findById(String id) {
        String sql = "SELECT c FROM " + classe.getName() + " c WHERE c.id = :valor";

        List<T> query = session
                .createQuery(sql)
                .setParameter("valor", id)
                .list();

        if (query.size() > 0)
            return query.get(0);

        return null;

    }

    @SuppressWarnings("unchecked")
    public T save(T entity) {
        return (T) session.save(entity);
    }

    public void update(T entity) {
        session.update(entity);
    }

    public void delete(T entity) {
        session.delete(entity);
    }
}
