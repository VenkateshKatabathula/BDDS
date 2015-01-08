/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.daointerfaces;
import com.daoimplementations.ListDaoImplementation;
import com.daoimplementations.LoginDaoImplementation;

import com.daointerfaces.ListDao;
import com.daointerfaces.LoginDao;


public class DaoFactory {

    private static LoginDao loginDao=null;
    private static ListDao listDao;
        
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
    
    public static ListDao getUpdateListDao()
    {
    	
    	return new ListDaoImplementation();
    	
    }

}
