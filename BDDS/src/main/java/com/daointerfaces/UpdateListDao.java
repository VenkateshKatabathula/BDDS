package com.daointerfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface UpdateListDao 
{
	public ResultSet getUpdateList() throws ClassNotFoundException,SQLException;
	
}
