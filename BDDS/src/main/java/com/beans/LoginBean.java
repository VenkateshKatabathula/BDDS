package com.beans;

public class LoginBean implements java.io.Serializable 
{

	private static final long serialVersionUID = -4443191538198049674L;
	private String userName=null;
	private String password=null;
	
	
	public LoginBean() 
	{
		super();
	}

	public LoginBean(String userName, String password) 
	{
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() 
	{
		return userName;
	}
	
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
}