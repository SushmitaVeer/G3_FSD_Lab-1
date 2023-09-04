package com.greatlearning.admin.driver;
import com.greatlearning.admin.model.Employee;
import com.greatlearning.admin.service.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ServiceInterface services = new CredentialService();
		
		// Take first name and last name from the user
		System.out.println("Enter Employee First Name :");
		String fname = sc.nextLine();
		
		System.out.println("Enter Employee Last Name :");
		String lname = sc.nextLine();
		
		Employee emp = new Employee(fname,lname);
		
		// A hard coded first name and last name
		//Employee emp = new Employee("Sushmita","Veer");
		
		System.out.println("Please enter the department from the following : ");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resourse");
		System.out.println("4.Legal");
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1:
			emp.setDepartment("technical");
			break;
		case 2:
			emp.setDepartment("admin");
			break;
		case 3:
			emp.setDepartment("hr");
			break;
		case 4:
			emp.setDepartment("legal");
			break;
			default :
				System.out.println("Please select valid option");
				break;
		}
		
		if (emp.getFirstName() != null && emp.getLastName() != null && emp.getDepartment() != null) {
			services.generateEmail(emp);
			services.generatePassword(emp);
			services.showCredentials(emp);
		}else {
			System.out.println("Invalid Employee details");
		}
				
	sc.close();

	}

}
