/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.services;

import com.beans.LoginBean;
import com.daofactory.DaoFactory;
import com.daointerfaces.LoginDao;
import java.sql.SQLException;

public class LoginService
{
	public String validateUser(LoginBean login) throws ClassNotFoundException, SQLException
	{
        LoginDao loginDao = DaoFactory.getLoginDao();
        return loginDao.validateUser(login);
	}
}