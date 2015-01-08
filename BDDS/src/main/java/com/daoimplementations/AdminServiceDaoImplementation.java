package com.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.daointerfaces.AdminServiceDao;
import com.util.DBUtility;

public class AdminServiceDaoImplementation implements AdminServiceDao
{

	public ResultSet getAdminService() throws ClassNotFoundException, SQLException
	{
		ResultSet orders = null;
		
		Connection con=DBUtility.getConnection();
		PreparedStatement orderDetails = con.prepareStatement("select * from order_Details where status='PENDING'");
		
		orders = orderDetails.executeQuery();
				
		return orders; 
		
	}
	
}
