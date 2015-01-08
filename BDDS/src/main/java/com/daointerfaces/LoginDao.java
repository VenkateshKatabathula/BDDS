/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.daointerfaces;

import com.beans.LoginBean;
import java.sql.SQLException;


public interface LoginDao {
public String validateUser(LoginBean login ) throws ClassNotFoundException, SQLException;
}
