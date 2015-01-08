package com.services;

import com.beans.RegistrationBean;
import com.daofactory.DaoFactory;
import java.sql.SQLException;
import com.daointerfaces.RegistrationDao;


public class RegistrationService {
	public int registerUser(RegistrationBean userInfo) throws ClassNotFoundException, SQLException{
RegistrationDao registrationDao = DaoFactory.getRegistrationDao();
	 return registrationDao.registerUser(userInfo);
		
				
	}

}