package com.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daofactory.DaoFactory;
import com.services.AdminService;
import com.servicesfactory.ServiceFactory;


@WebServlet("/AdminRequests")
public class AdminRequests extends HttpServlet {
	
	private static ResultSet orders;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		AdminService AdminService = ServiceFactory.getAdminService();
		try 
		{
			orders=AdminService.getAdminService();
			System.out.println(orders);
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		if(orders!=null)
		{
			
			request.setAttribute("order", orders);
			RequestDispatcher rd = request.getRequestDispatcher("PendingRequestsPage.jsp");
			rd.forward(request,response);
			
		}
	}

}
