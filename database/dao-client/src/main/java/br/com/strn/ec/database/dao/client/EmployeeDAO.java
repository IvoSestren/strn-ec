package br.com.strn.ec.database.dao.client;

import br.com.strn.ec.database.dao.GenericDAO;
import br.com.strn.ec.database.entities.client.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.inject.Inject;
import java.util.List;

public class EmployeeDAO extends GenericDAO<Employee> {

    /**
     * @deprecated CDI eyes only
     */
    protected EmployeeDAO() {
        this(null);
    }

    @Inject
    public EmployeeDAO(Session session) {
        super(session);
    }

    public List<Employee> findByEmail(String email) {
        Query<Employee> q = session.createQuery("SELECT a FROM Employee a WHERE a.email = :email", Employee.class);
        q.setParameter("email", email);
        return q.getResultList();
    }
}