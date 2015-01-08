package com.beans;

import java.sql.Date;

public class RegistrationBean 
{

	private String customerId;
	private String userName;
	private String password;
	private String gender;
	private Long mobileNumber;
	private String Address;
	
	
	public RegistrationBean() 
	{
	
	}
	public RegistrationBean(String customerId, String userName, String password, String gender,
			Date dOB, Long mobileNumber, String address) {
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.customerId = customerId;
		Address = address;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	
}
