package com.greatLearning.model;

public class Employee {
	private String firstName;
	private String LastName;
	
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.LastName;		
	}
	public Employee(String fname, String Lname){
		this.firstName = fname;
		this.LastName = Lname;
	}
	
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	public void setLastName(String LastName){
		this.LastName=LastName;		
	}

}
