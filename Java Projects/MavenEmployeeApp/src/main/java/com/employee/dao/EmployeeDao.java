package com.employee.dao;

import com.employee.entities.Employee;

public interface EmployeeDao {
	
	  void save(Employee emp); 
	  
	  public String getAddressOfEmployee(int empId);
	  
	  public String giveBonusToEmployee(int empId, int bonus); 
	  
	  public boolean deleteEmployee(int empId);

}
