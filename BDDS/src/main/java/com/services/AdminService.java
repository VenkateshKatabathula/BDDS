package com.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.daofactory.DaoFactory;
import com.daointerfaces.AdminServiceDao;

public class AdminService 
{
	
	public static ResultSet getAdminService() throws ClassNotFoundException, SQLException
	{
		AdminServiceDao adminservicedao=DaoFactory.getAdminService();
		return adminservicedao.getAdminService();
		
	}
	
}
