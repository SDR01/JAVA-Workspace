package com.employee.main;

import java.util.Scanner;

import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;
import com.employee.usecases.DeleteEmployee;
import com.employee.usecases.GetEmployeeAddress;
import com.employee.usecases.GiveBonusToEmployee;
import com.employee.usecases.InsertEmployee;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		
		System.out.println("\n ********* Welcome to Employee Application ********* \n");
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("");
			System.out.println("1. Register an Employee");
			System.out.println("2. Get Address of Employee using ID");
			System.out.println("3. Give Bonus to an Employee");
			System.out.println("4. Delete an Employee using ID");
			System.out.println("5. Exit the Application \n");
			
			System.out.println("Select the option by entering number:");
			int option = sc.nextInt();
			
			switch (option) {
				case 1:
					{
						InsertEmployee e1 = new InsertEmployee();
						e1.main(args);
						break;
					}
				case 2:
					{
						GetEmployeeAddress e1 = new GetEmployeeAddress();
						e1.main(args);
						break;
					}
				case 3:
					{
						GiveBonusToEmployee e1 = new GiveBonusToEmployee();
						e1.main(args);
						break;
					}
				case 4:
					{
						DeleteEmployee e1 = new DeleteEmployee();
						e1.main(args);
						break;
					}
				case 5:
					{
						System.out.println("Thank you for using our Application");
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
