package com.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.beans.OrderBean;
import com.daointerfaces.OrderRequestDao;
import com.util.DBUtility;

public class OrderRequestDaoImplementation implements OrderRequestDao 
{

	public int setRequestDetails(OrderBean orderBean) throws SQLException,ClassNotFoundException 
	{
		
		Connection con = DBUtility.getConnection();
		
		
		PreparedStatement order = con.prepareStatement("insert into order_details " +
				"values(order_id.nextval," +
				"+sysdate,itemList(items(101,?),items(102,?),items(103,?),items(104,?),items(105,?))" +
				",?,'PENDING')");
		PreparedStatement price = con.prepareStatement("select item_price from items_available");
		ResultSet priceList = price.executeQuery();
		
		int TotalPrice=0;
		int item[]={orderBean.getItem1(),orderBean.getItem2(),orderBean.getItem3(),orderBean.getItem4(),orderBean.getItem5()};
		int iterateItems=0;
		while(priceList.next())
		{
			TotalPrice+=priceList.getInt(1)*item[iterateItems];
			iterateItems++;
		}
				
		order.setInt(1,orderBean.getItem1());
		order.setInt(2,orderBean.getItem2());
		order.setInt(3,orderBean.getItem3());
		order.setInt(4,orderBean.getItem4());
		order.setInt(5,orderBean.getItem5());
		order.setInt(6,TotalPrice);
		
		boolean result=order.execute();
		System.out.println(result);
		PreparedStatement oid = con.prepareStatement("select order_id.currval from dual");
		ResultSet orderid = oid.executeQuery();
		int id=0;
		if(orderid.next())
			id=orderid.getInt(1);
		return id;
		
	}
	
}
