package com.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.beans.LoginBean;
import com.daoimplementations.LoginDaoImplementation;

public class LoginTest {
  
	String username="1202";
	String password="kriskris";
	
	@Test
	public void validateUser() throws ClassNotFoundException, SQLException
	{
		LoginBean lb = new LoginBean();
		lb.setUserName(username);
		lb.setPassword(password);
		
		LoginDaoImplementation login = new LoginDaoImplementation();
		
		String role=login.validateUser(lb);
		assertEquals("USER",role);
		System.out.println("successfull");
		
	}
	
}
