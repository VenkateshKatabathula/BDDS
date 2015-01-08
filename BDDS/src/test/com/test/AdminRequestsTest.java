package com.test;

import static org.junit.Assert.assertNotNull;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Test;
import com.services.AdminService;
import com.servicesfactory.ServiceFactory;

public class AdminRequestsTest {
	
	ResultSet orders;
	@Test
	public void validateUser() throws ClassNotFoundException, SQLException
	{
		AdminService AdminService = ServiceFactory.getAdminService();
		
		orders=AdminService.getAdminService();
		System.out.println(orders);		
		assertNotNull(orders);
		System.out.println("successfull");
		
	}
	
}
