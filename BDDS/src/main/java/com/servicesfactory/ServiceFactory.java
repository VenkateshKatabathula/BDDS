package com.servicesfactory;

import com.services.AdminService;
import com.services.ListService;
import com.services.LoginService;
import com.services.OrderService;
import com.services.PendingRequestService;
import com.services.RegistrationService;


public class ServiceFactory {

    private static LoginService loginService = null;
    private static RegistrationService registrationService=null;
    
    
       public static LoginService getLoginService( ){
    	
        if(loginService==null){
            loginService= new LoginService( );
        }
        else{
            return loginService;
        }
        return loginService;
    }
    
    public static RegistrationService getRegistrationService( ){
    	
        if(registrationService==null){
            registrationService= new RegistrationService( );
        }
        else{
            return registrationService;
        }
        return registrationService;
    }
    
    public static ListService getListService()
    {
    	
    	return new ListService();
    	
    }
    
    public static ListService getUpdateService()
    {    	
    	return new ListService();
    }
    
    public static OrderService getOrderService()
    {
    	return new OrderService();
    }
    
    public static AdminService getAdminService()
    {
    	return new AdminService();
    }
    
    public static PendingRequestService getPendingRequestService()
    {
    	return new PendingRequestService();
    }
    public static ListService addItemsListService()
    {
    	System.out.println("services factory");
    	return new ListService();
    }
    
}
