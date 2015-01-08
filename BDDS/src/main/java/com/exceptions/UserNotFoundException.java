package com.exceptions;

public class UserNotFoundException extends Exception 
{

	private static final long serialVersionUID = -2150609617598971042L;
	String exceptionDetails=null;

	public UserNotFoundException(String exceptionDetails) 
	{
			this.exceptionDetails = exceptionDetails;
	}
	
	public String toString()
	{
		return this.exceptionDetails;
	}
	
}
