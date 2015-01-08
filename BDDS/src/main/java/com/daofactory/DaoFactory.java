/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.daofactory;
import com.daoimplementations.AdminServiceDaoImplementation;
import com.daoimplementations.ListDaoImplementation;
import com.daoimplementations.LoginDaoImplementation;
import com.daoimplementations.OrderRequestDaoImplementation;
import com.daoimplementations.PendingRequestDaoImplementation;

import com.daoimplementations.RegistrationDaoImplementation;
import com.daoimplementations.UpdateListDaoImplementation;

import com.daointerfaces.AdminServiceDao;
import com.daointerfaces.ListDao;
import com.daointerfaces.LoginDao;
import com.daointerfaces.OrderRequestDao;
import com.daointerfaces.PendingRequestDao;
import com.daointerfaces.RegistrationDao;
import com.daointerfaces.UpdateListDao;


public class DaoFactory {

    private static LoginDao loginDao=null;
    private static ListDao listDao;
    private static UpdateListDao updateListDao;

	
    
    public static LoginDao getLoginDao( ){
        if(loginDao==null){
            loginDao=new LoginDaoImplementation( );
        }
        else{
            return loginDao;
        }
        return loginDao;

    }
    public static ListDao getListDao()
    {
    	
    	listDao = new ListDaoImplementation();
    	return listDao;
    	
    }
    
    public static RegistrationDao getRegistrationDao()
    {
    	
    	return new RegistrationDaoImplementation();
    	
    }

    public static UpdateListDao getUpdateListDao()
    {
    	
    	updateListDao = new UpdateListDaoImplementation();
    	return updateListDao;
    	
    }
	public static OrderRequestDao getOrderRequestDao() 
	{
		return new OrderRequestDaoImplementation();
	}
 
	public static AdminServiceDao getAdminService()
	{
		
		return new AdminServiceDaoImplementation();
		
	}
	
	public static PendingRequestDao getPendingRequests()
	{
		
		return new PendingRequestDaoImplementation();
		
	}
	public static ListDao addItemsList()
	{
		System.out.println("daofactory");
		return new ListDaoImplementation();
		
	}
    
  
    
}
