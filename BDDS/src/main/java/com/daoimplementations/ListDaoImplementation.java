package com.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.beans.UpdateBean;
import com.daointerfaces.ListDao;
import com.util.DBUtility;

public class ListDaoImplementation implements ListDao 
{
	
	@Override
	public ResultSet getList() throws ClassNotFoundException, SQLException {
		Connection con = DBUtility.getConnection();
		
		Statement retrievalStatement = con.createStatement();
		ResultSet rs= retrievalStatement.executeQuery("select * from items_available");
		
		return rs;
	}
	
	public int addItemsList(UpdateBean ub) throws ClassNotFoundException, SQLException 
	{
		System.out.println("INside listdaoImpel");
		
		Connection con = DBUtility.getConnection();
		PreparedStatement ps= con.prepareStatement("update items_available set item_quantity=item_quantity+? where item_id=?");
		
		PreparedStatement items = con.prepareStatement("select item_id from items_available");
		ResultSet res = items.executeQuery();
		int[] add={ub.getItem1(),ub.getItem2(),ub.getItem3(),ub.getItem4(),ub.getItem5()};
		int i=0,n=0;
		
		while(i<5)
		{
			if(res.next())
			{
				ps.setInt(1,add[i]);
				ps.setInt(2,res.getInt(1));
				i++;
				n=ps.executeUpdate();
			}
		}
		return n;
		
	}
	
}
