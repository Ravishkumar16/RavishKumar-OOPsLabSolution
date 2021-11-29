package com.greatLearning.service;

import java.util.Random;

import com.greatLearning.model.Employee;

public class CredentialService {
	String generatedemailAddress="";
	String generatedpassword="";
	String numbers = "1234567890";
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String specialChars = "!@#$%^&*()";

	public String generatePassword(){
		Random randomize = new Random();
		char [] password = new char[8];

		
		for (int i = 1; i < 8; i++) {
			int z = i % 3;
			password [0] = capitalLetters.charAt(randomize.nextInt(capitalLetters.length()));
			switch (z){
			case 1:
				password [i] = numbers.charAt(randomize.nextInt(numbers.length()));
			case 2:
				password [i] = smallLetters.charAt(randomize.nextInt(smallLetters.length()));
			case 0:
				password [i] = specialChars.charAt(randomize.nextInt(specialChars.length()));
			}
		}
		generatedpassword =password.toString();
		return generatedpassword;
	}
	public String generateEmailAddress(String firstName, String LastlastName, String DeptName){
		
		generatedemailAddress = firstName+LastlastName+"@"+DeptName+".company.com";
		return generatedemailAddress;
	
	}
	
	
	public void showPassword(Employee empObject, String email, String generatedPassword){
		
		System.out.println("Dear "+empObject.getFirstName() +" Your generated credetials are as follows :");
		System.out.println("Email  ------> "+ email);
		System.out.println("Password  ------> "+ generatedPassword);
		
	}
	
	
}
