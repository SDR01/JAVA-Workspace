package com.employee.usecases;

import java.util.Scanner;

import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;
import com.employee.entities.Employee;

public class InsertEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			
			System.out.println(" ");
			System.out.println("1. Register an Employee");
			System.out.println("2. Exit \n");

			System.out.println("Enter a number 1 or 2");
			
			int option = sc.nextInt();
			
			switch (option) {
					case 1:
						System.out.println("");
						
						System.out.println("Enter Employee ID:");
						int eid = sc.nextInt();

						System.out.println("Enter Employee Name:");
						String ename = sc.next();
						
						System.out.println("Enter Employee Address:");
						String address = sc.next();
						
						System.out.println("Enter Employee Salary:");
						int salary = sc.nextInt();
						
						EmployeeDao employeeDao = new EmployeeDaoImpl();
						
						Employee employee = new Employee(eid, ename, address, salary);
						
						employeeDao.save(employee);
						
						break;
					case 2:
					{
						flag = false;
						break;
					}
		
					default:
						System.out.println("Please enter correct number");
						break;
			}
		}
		
	}

}
