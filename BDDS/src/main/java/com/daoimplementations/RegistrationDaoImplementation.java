package com.daoimplementations;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.beans.RegistrationBean;
import com.daointerfaces.RegistrationDao;
import com.util.DBUtility;

public class RegistrationDaoImplementation  implements RegistrationDao
{
	public int registerUser( RegistrationBean userInfo) throws ClassNotFoundException, SQLException
	{
		Connection con = DBUtility.getConnection();
		  
		String query="insert into customer_Details values(cust_ID.nextval,?,?,?,?,?)";
        String q2="insert into  login_credentials values(?,?,?)";
        
        
        PreparedStatement psmt = con.prepareStatement(query);
        PreparedStatement loginCredSt = con.prepareStatement(q2);
        
        String userId;
        String userName=userInfo.getUserName();
        String pwd=userInfo.getPassword();
        psmt.setString(1, userName);
        psmt.setString(2, pwd);
        psmt.setString(3, userInfo.getGender());        
        psmt.setLong(4, userInfo.getMobileNumber());
        psmt.setString(5,userInfo.getAddress());
        
        PreparedStatement getUserID = con.prepareStatement("select CUSTOMER_ID from customer_details where CUSTOMER_NAME=? and PASSWORD =?");
        getUserID.setString(1,userName);
        getUserID.setString(2,userInfo.getPassword());
       
        psmt.execute();
        
        ResultSet res = getUserID.executeQuery();
        if(res.next())
        userId=res.getString(1);
        else
        	return 0;
        
        loginCredSt.setString(1, userId);
        loginCredSt.setString(2, pwd);
        loginCredSt.setString(3,"USER");
         
        loginCredSt.execute();
       
       
        return Integer.parseInt(userId);
    }
}