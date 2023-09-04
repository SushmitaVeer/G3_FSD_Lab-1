package com.greatlearning.admin.service;

import java.util.Random;

import com.greatlearning.admin.model.Employee;

public class CredentialService implements ServiceInterface {

	@Override
	public void generatePassword(Employee employee) {
		
		final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		final String numbers = "0123456789";
		final String specialSymbols = "!@#$%^&*()-_=+[]{}|;:'\\\",.<>?";
		final String finalPassword = upperCase + lowerCase + numbers + specialSymbols;
		Random random = new Random(); 
		
		String generatePassword = "";
		for(int i = 0; i < 8 ;i++) {
			generatePassword = generatePassword + finalPassword.charAt(random.nextInt(finalPassword.length()));
		}
		employee.setPassword(generatePassword);
	}

	@Override
	public void generateEmail(Employee employee) {
		
		String emailAddress = employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+"@"+employee.getDepartment()+".gl.in";
		employee.setEmailId(emailAddress);
		
	}

	@Override
	public void showCredentials(Employee employee) {
		
		System.out.println("");
		System.out.println("Dear " + employee.getFirstName() + " your credentials are as follows :");
		System.out.println("Email Address --> " +employee.getEmailId());
		System.out.println("Password  --> " +employee.getPassword());
		
	}
	
	
}
