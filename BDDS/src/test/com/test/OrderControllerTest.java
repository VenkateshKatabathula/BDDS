package com.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.beans.OrderBean;
import com.services.OrderService;
import com.servicesfactory.ServiceFactory;

public class OrderControllerTest 
{
	@Test
	public void validateOrderService() throws ClassNotFoundException, SQLException
	{
		
		OrderBean order = new OrderBean();
        order.setItem1(10);
        order.setItem2(5);
        order.setItem3(4);
        order.setItem4(3);
        order.setItem5(1);
        
       	OrderService orderService = ServiceFactory.getOrderService();
       	int result = orderService.getOrderService(order);
        assertEquals(1,result);
		
	}
	
}
