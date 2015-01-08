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

@WebServlet("/AvailableItemsList")
public class AvailableItemsList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ListService list = ServiceFactory.getListService();
		ResultSet res=null;
		try 
		{
			res = list.getListDao();
		} 
			catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		request.setAttribute("var",res);
		RequestDispatcher rd = request.getRequestDispatcher("updateItems.jsp");
		rd.forward(request,response);
		
	}

}
