/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.daoimplementations;

import com.beans.LoginBean;
import com.daointerfaces.LoginDao;
import com.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDaoImplementation implements LoginDao {
public String validateUser( LoginBean login) throws ClassNotFoundException, SQLException
{
        String role = "";
        Connection con = DBUtility.getConnection();
        PreparedStatement psmt = con.prepareStatement("select role from login_credentials where user_id=? and password=?");
        psmt.setString(1, login.getUserName());
        System.out.println(login.getUserName());
        psmt.setString(2, login.getPassword());
        System.out.println(login.getPassword());
       
        ResultSet rs = psmt.executeQuery();
       
      if(rs.next())
      {
            role=rs.getString("ROLE");
            System.out.println(role);
      }
      else
      {
            role = "invalid";
      }
        return role;
    }


}
