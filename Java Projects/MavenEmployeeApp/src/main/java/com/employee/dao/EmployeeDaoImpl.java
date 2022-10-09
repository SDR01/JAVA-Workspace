package com.employee.dao;

import javax.persistence.EntityManager;

import com.employee.entities.Employee;
import com.employee.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void save(Employee emp) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Employee Successfully Added");
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		String message = "Employee not found";
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee employee = em.find(Employee.class, empId);
		
		if(employee != null) {
			
			message = employee.getAddress();
			
		}
		
		em.close();
		
		return message;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String message = "Employee not found";
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee employee = em.find(Employee.class, empId);
		
		if(employee != null) {
			
			em.getTransaction().begin();
			
		    employee.setSalary(employee.getSalary() + bonus);
			
			em.getTransaction().commit();
			
			message = "Bonus added successfully";
		}
		
		em.close();
		
		return message;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean flag = false;
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee emp = em.find(Employee.class, empId);
		
		if(emp != null) {
			
			em.getTransaction().begin();
			
			em.remove(emp);
			flag = true;
			
			em.getTransaction().commit();
		}
		
		em.close();
		
		return flag;
	}
	

}
