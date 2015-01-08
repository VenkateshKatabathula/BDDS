package com.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.services.ListService;
import com.servicesfactory.ServiceFactory;


@WebServlet("/ItemsList")
public class ItemsList extends HttpServlet {
    private static final long serialVersionUID = 1L;


	public ItemsList() 
    {
        super();

    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		response.setContentType("text/html");
		
		ListService list = ServiceFactory.getListService();
		
		try 
		{
			System.out.println("Entered itemslist");
			ResultSet res = list.getListDao();
			System.out.println(res);
			
			
			if(res!=null)
			{
				
				request.setAttribute("var", res);
				
				RequestDispatcher rd = request.getRequestDispatcher("List.jsp");
					
	    		rd.forward(request,response);
	    	}
		} 
		
		catch (ClassNotFoundException e) 
		{
					e.printStackTrace();
		} 
		
		catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
				
	}

}
