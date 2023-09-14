package com.jbk.empmgtsys;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.jbk.util.HibernateUtil;

/**
 * EmployeeServices class have service logic related to employee operations
 **/
public class EmployeeServices {

	// to add new employee
	public void addNewEmployee(Employee employee) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		session.save(employee);
		session.beginTransaction().commit();
		session.close();
		System.out.println("Employee added successfully!");
	}

	// to fetch employee based on id
	public Employee getEmployeeById(int empId) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Employee employee = (Employee) session.get(Employee.class, empId);
		return employee;

	}

	// to fetch all of the employees
	public List<Employee> getAllEmployee() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> listEmp = criteria.list();
		session.close();
		return listEmp;
	}

	// to update employees using id
	public String updateEmployee(Employee empToUpdate, int empId) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Employee employee = (Employee) session.get(Employee.class, empId);
		if (employee != null) {
			employee.setFirstName(empToUpdate.getFirstName());
			employee.setLastName(empToUpdate.getLastName());
			employee.setSalary(empToUpdate.getSalary());
			employee.setDateOfBirth(empToUpdate.getDateOfBirth());
			employee.setDepartment(empToUpdate.getDepartment());
			employee.setEmail(empToUpdate.getEmail());
			session.beginTransaction().commit();
			session.close();
			return "employee updated with id " + empId;
		} else {
			return "employee not found with id " + empId;
		}
	}

	// to delete employee using empId
	public String deleteEmployee(int empIdToDelete) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Employee employee = (Employee) session.get(Employee.class, empIdToDelete);
		if (employee != null) {
			session.delete(employee);
			session.beginTransaction().commit();
			session.close();
			return "employee deleted";
		} else {
			return "no employee found with id" + empIdToDelete;
		}
	}

	// to fetch the employees using salary condition
	public List<Employee> findEmployeeWithSal(double salary) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.add(Restrictions.gt("salary", salary)).list();
		session.close();
		return list;
	}

	// to fetch employee with department
	public List<Employee> findEmployeeWithDept(String[] dept) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Disjunction disjunction = Restrictions.disjunction();

		for (int i = 0; i < dept.length; i++) {
			disjunction.add(Restrictions.eq("department", dept[i]));
		}
		List<Employee> list = criteria.add(disjunction).list();
		return list;
	}

	// to fetchc the employee using department not in condition
	public List<Employee> findEmployeeDepartmentNotIn(String department) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.add(Restrictions.ne("department", "tester")).list();
		return list;

	}

	// sort the employees on salary bases in desc order
	public List<Employee> sortEmployeeOnSalaryDesc() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.addOrder(Order.desc("salary")).list();
		return list;
	}

}