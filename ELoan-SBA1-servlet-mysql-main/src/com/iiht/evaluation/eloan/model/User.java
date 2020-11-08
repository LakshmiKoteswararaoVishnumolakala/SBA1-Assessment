package com.iiht.evaluation.eloan.model;

public class User {	
	
	private static String FirstName;
	private static String LastName;
	private static String Gender;
	private static String DateOfBirth;
	private static String UserID;	
	private static String Password;
	
	public User(String firstName, String lastName, String gender, String dateOfBirth, String userID, String password) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Gender = gender;
		DateOfBirth = dateOfBirth;
		UserID = userID;
		Password = password;
	}
	
	public static String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public static String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public static String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public static String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public static String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public static String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
