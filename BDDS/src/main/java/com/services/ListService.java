package com.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.beans.UpdateBean;
import com.daofactory.DaoFactory;
import com.daointerfaces.ListDao;
import com.daointerfaces.UpdateListDao;

public class ListService 
{
	
	
	public ResultSet getListDao() throws ClassNotFoundException, SQLException
	{
		
		ListDao listDao = DaoFactory.getListDao();
		
		return listDao.getList();
		
	}
	public ResultSet getUpdateListDao() throws ClassNotFoundException,SQLException
	{
		UpdateListDao updatelistDao = DaoFactory.getUpdateListDao();
		
		return updatelistDao.getUpdateList();
		
	}
	public int addItemsList(UpdateBean up) throws ClassNotFoundException,SQLException
	{
		System.out.println("service");
		ListDao itemslistDao = DaoFactory.addItemsList();
		
		return itemslistDao.addItemsList(up);
		
	}
	
}
