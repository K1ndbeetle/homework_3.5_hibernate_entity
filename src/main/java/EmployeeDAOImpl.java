import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Connection;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void addEmployee(Employee employee) {
        try (Session session = HibernateSessionUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }
    }

    @Override
    public Employee receiptEmployeeById(int id) {
        try (Session session = HibernateSessionUtil.getSessionFactory().openSession()) {
            return session.get(Employee.class, id);
        }
    }

    @Override
    public List<Employee> gettingListAllEmployee() {
        try(Session session = HibernateSessionUtil.getSessionFactory().openSession()){
            return session.createQuery("FROM Employee").getResultList();
        }
    }

    @Override
    public void changingEmployeeId(Employee employee, int id) {
        try(Session session = HibernateSessionUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            employee.setId(id);
            session.update(employee);
            transaction.commit();
        }
    }

    @Override
    public void deleteEmployeeId(Employee employee) {
        try (Session session = HibernateSessionUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(employee);
            transaction.commit();
        }
    }
}
