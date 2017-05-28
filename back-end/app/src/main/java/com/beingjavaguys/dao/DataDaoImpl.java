package com.beingjavaguys.dao;

import java.util.List;
import com.beingjavaguys.model.Message;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import com.beingjavaguys.model.Message;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.Criteria;

public class DataDaoImpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

    @Override
    public List<Message> getMessages(String login) throws Exception {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        String sql = "SELECT M.* FROM Message AS M JOIN User ON M.User_idUser = User.idUser WHERE User.login = :user_login";
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(Message.class);
        query.setParameter("user_login", login);
        query.setParameter("employee_id", 10);
        List results = query.list();
        return results;
    }
/*
	@Override
	public boolean addEntity(Employee employee) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();

		return false;
	}

	@Override
	public Employee getEntityById(long id) throws Exception {
		session = sessionFactory.openSession();
		Employee employee = (Employee) session.load(Employee.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Employee> employeeList = session.createCriteria(Employee.class)
				.list();
		tx.commit();
		session.close();
		return employeeList;
	}
	
	@Override
	public boolean deleteEntity(long id)
			throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(Employee.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}
*/
}
