package com.greatLearning.driver;

import java.util.Scanner;

import com.greatLearning.model.Employee;
import com.greatLearning.service.CredentialService;

public class Driver {
	public static void main (String args[]){
		
		Scanner scanner= new Scanner (System.in);
		System.out.println("Welcome to the greatLearning, lets generate your credeantials :");
		System.out.println("Please Enter your First Name :");
		String fname = scanner.nextLine();
		System.out.println("Please Enter your Last Name :");
		String lname = scanner.nextLine();
		System.out.println("Please choose  from department which you belong to :");
		System.out.println("1. Technical ");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		String departName = null;
		int option = scanner.nextInt();

			switch (option) {
			case 1:
				departName = "Technical";
				break;
			case 2:
				departName = "Admin";
				break;
			case 3:
				departName = "Human Resource";
				break;
			case 4:
				departName = "Legal";
				break;
			default:
				System.out.println("Wrong input");

			}
			
			
			Employee Emp = new Employee(fname, lname);
			CredentialService cr = new CredentialService();
			String pwd = cr.generatePassword();
			String email =cr.generateEmailAddress(fname, lname, departName);
			cr.showPassword(Emp, email, pwd);
	}
	

}
