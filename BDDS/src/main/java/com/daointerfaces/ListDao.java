package com.daointerfaces;

import java.sql.SQLException;
import java.sql.ResultSet;

import com.beans.UpdateBean;
public interface ListDao 
{

	public ResultSet getList() throws ClassNotFoundException,SQLException;
	
	public int addItemsList(UpdateBean ub) throws ClassNotFoundException, SQLException ;
}
