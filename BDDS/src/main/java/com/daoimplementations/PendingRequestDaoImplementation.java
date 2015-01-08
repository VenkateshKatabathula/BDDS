package com.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.daointerfaces.PendingRequestDao;
import com.util.DBUtility;

public class PendingRequestDaoImplementation implements PendingRequestDao 
{
public int updateStatus(int orderID) throws ClassNotFoundException, SQLException
{
	Connection con=DBUtility.getConnection();
	con.setAutoCommit(false);
	PreparedStatement pst=con.prepareStatement("update order_details set status='APPROVED' where order_id=?");
	pst.setInt(1,orderID);
	int i=pst.executeUpdate();
	con.commit();
	return i;
}
}
