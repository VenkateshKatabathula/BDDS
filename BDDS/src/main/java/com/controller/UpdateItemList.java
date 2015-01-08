package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.UpdateBean;
import com.services.ListService;
import com.servicesfactory.ServiceFactory;

@WebServlet("/UpdateItemList")
public class UpdateItemList extends HttpServlet {
	
    public UpdateItemList() 
    {
        super();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
	
    	String item1=request.getParameter("quantity1");
    	String item2=request.getParameter("quantity2");
    	String item3=request.getParameter("quantity3");
    	String item4=request.getParameter("quantity4");
    	String item5=request.getParameter("quantity5");
    	
    	UpdateBean ub = new UpdateBean();
    	ub.setItem1(Integer.parseInt(item1));
    	ub.setItem2(Integer.parseInt(item2));
    	ub.setItem3(Integer.parseInt(item3));
    	ub.setItem4(Integer.parseInt(item4));
    	ub.setItem5(Integer.parseInt(item5));
    	
    	ListService updateService = ServiceFactory.addItemsListService();	
    	int add=0;
    	try 
    	{
    		System.out.println("Before Query");
			add=updateService.addItemsList(ub);
		} 
    		catch (ClassNotFoundException e ) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    	System.out.println("after adding");
    	if(add>0)
    	{
    	RequestDispatcher rd = request.getRequestDispatcher("ItemsAdded.html");
    	rd.forward(request,response);
    	}
    	else
    	{
    		RequestDispatcher rd = request.getRequestDispatcher("ItemsAddedFail.html");
        	rd.forward(request,response);
    		
    	}
    	
	}

}
