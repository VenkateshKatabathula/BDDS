package com.test;

import static org.junit.Assert.assertNotNull;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.services.AdminService;
import com.servicesfactory.ServiceFactory;

public class AvailableItemsTest 
{
	ResultSet items;
	@Test
	public void validateItems() throws ClassNotFoundException, SQLException
	{
		AdminService AdminService = ServiceFactory.getAdminService();
		
		items=AdminService.getAdminService();
				
		assertNotNull(items);
		System.out.println("successfull");
		
	}
	
}
