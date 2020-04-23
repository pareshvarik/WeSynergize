package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.beans.Employee_data;

@Repository
public class DAOImpl implements DAO {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory = null;

	Employee_data employee_data = new Employee_data();

	@Override
	public Employee_data login(Integer userid, String password) {
		entityManagerFactory = Persistence.createEntityManagerFactory("electriccar_charging_management");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {

			String jpql = "select full_name from Employee_data where employee_id=:uid and password=:upwd";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("uid", userid);
			query.setParameter("upwd", password);
			String full_name = (String) query.getSingleResult();
			if (full_name == null) {
				System.out.println("invalid user id or password");
			} else {
				employee_data.setFull_name(full_name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return employee_data;
	}

	
	
	@Override
	public List<Employee_data> getAllEmployeeDetails() {
		try {

			entityManagerFactory = Persistence.createEntityManagerFactory("electriccar_charging_management");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from Employee_data";
			Query query = entityManager.createQuery(jpql);
			@SuppressWarnings("unchecked")
			List<Employee_data> list = query.getResultList();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
