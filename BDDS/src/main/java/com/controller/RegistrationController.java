package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.RegistrationBean;
import com.services.RegistrationService;
import com.servicesfactory.ServiceFactory;

@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	
    	
    	RegistrationBean userBean = new RegistrationBean();
    	//Creating  a bean for registration of user
    	
    	userBean.setUserName(request.getParameter("username"));
    	userBean.setPassword(request.getParameter("password"));
    	userBean.setGender(request.getParameter("gender"));
    	userBean.setMobileNumber(Long.parseLong(request.getParameter("mobilenumber")));
    	userBean.setAddress(request.getParameter("address"));
    	
    	RegistrationService regservice = ServiceFactory.getRegistrationService();
    	int i=0;
    	try 
    	{
			 i=regservice.registerUser(userBean);
		} 
    	catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
	catch(SQLException e)
		{
			
			e.printStackTrace();
		}
    	
    	if(i>0)
    	{
    		request.setAttribute("userID",i);
    		RequestDispatcher rd = request.getRequestDispatcher("successpage.jsp");
    		rd.forward(request,response);
    	}
    	else
    	{
    		RequestDispatcher rd = request.getRequestDispatcher("ErrorPage.html");
    		rd.forward(request,response);
    		
    	}	
	}

}
