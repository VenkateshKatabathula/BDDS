package com.daoimplementations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.beans.UpdateBean;
import com.daointerfaces.UpdateListDao;
import com.util.DBUtility;

public class UpdateListDaoImplementation implements UpdateListDao
{
	@Override
	public ResultSet getUpdateList() throws ClassNotFoundException, SQLException 
	{
		Connection con = DBUtility.getConnection();
		
		Statement retrievalStatement = con.createStatement();
		ResultSet rs= retrievalStatement.executeQuery("select * from items_available");
			
		return rs;
}
	
}
