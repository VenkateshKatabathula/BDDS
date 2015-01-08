package com.daointerfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface AdminServiceDao {

	public ResultSet getAdminService()throws ClassNotFoundException, SQLException;
	
}
