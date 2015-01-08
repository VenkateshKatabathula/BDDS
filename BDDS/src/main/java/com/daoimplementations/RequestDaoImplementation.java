package com.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.util.DBUtility;

public class RequestDaoImplementation {
	public void setRequestDetails() throws Exception
	{
		Connection con=DBUtility.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into order_details values(?,?,?,?");
	    //pst.setString(1,)
	}
}
