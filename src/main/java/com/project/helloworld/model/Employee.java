package com.project.helloworld.model;

public class Employee {
	private String ID ;
	private String loginID;
	private String Displayname;
	private String  FirstName;
	private String  lastName;
	private String  Email;
	private String  Function;
	private String  Organization_Unit;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID =iD;
	}
	public String getDisplayname() {
		return Displayname;
	}
	public void setDisplayname(String displayname) {
		Displayname = displayname;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFunction() {
		return Function;
	}
	public void setFunction(String function) {
		Function = function;
	}
	public String getOrganization_Unit() {
		return Organization_Unit;
	}
	public void setOrganization_Unit(String organization_Unit) {
		Organization_Unit = organization_Unit;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	

	}