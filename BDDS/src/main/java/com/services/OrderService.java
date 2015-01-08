package com.services;

import java.sql.SQLException;

import com.beans.OrderBean;
import com.daofactory.DaoFactory;
import com.daointerfaces.OrderRequestDao;

public class OrderService 
{

	public int getOrderService(OrderBean orderBean) throws ClassNotFoundException, SQLException
	{
				
		OrderRequestDao orderRequestDao = DaoFactory.getOrderRequestDao();
		return orderRequestDao.setRequestDetails(orderBean);
	}
	
}
