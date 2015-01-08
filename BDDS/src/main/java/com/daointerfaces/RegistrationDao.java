package com.daointerfaces;
import java.sql.SQLException;

import com.beans.RegistrationBean;

public interface RegistrationDao 
{
	public abstract int registerUser(RegistrationBean userInfo)
						throws ClassNotFoundException, SQLException;
}
