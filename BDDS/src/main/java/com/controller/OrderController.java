package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.OrderBean;
import com.services.OrderService;
import com.servicesfactory.ServiceFactory;

@WebServlet("/OrderController")
public class OrderController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		response.setContentType("text/html;charset=UTF-8");
        OrderBean order = new OrderBean();
        if(!request.getParameter("quantity1").equals(""))
        	order.setItem1(Integer.parseInt((String)request.getParameter("quantity1")));
        else
        	order.setItem1(0);
        
        if(!request.getParameter("quantity2").equals(""))
        	order.setItem2(Integer.parseInt((String)request.getParameter("quantity2")));
        else
        	order.setItem2(0);
        
        if(!request.getParameter("quantity3").equals(""))
        	order.setItem3(Integer.parseInt((String)request.getParameter("quantity3")));
        else
        	order.setItem3(0);
        
        if(!request.getParameter("quantity4").equals(""))
        	order.setItem4(Integer.parseInt((String)request.getParameter("quantity4")));
        else
        	order.setItem4(0);
        
        if(!request.getParameter("quantity5").equals(""))
        	order.setItem5(Integer.parseInt((String)request.getParameter("quantity5")));
        else
        	order.setItem5(0);
        
        
        try
        {	
        	
        	OrderService orderService = ServiceFactory.getOrderService();
        	int result = orderService.getOrderService(order);
        	
        	if(result>0)
        	{
        		request.setAttribute("orderID",result);
        		RequestDispatcher rd = request.getRequestDispatcher("OrderSuccessPage.jsp");
        		rd.forward(request, response);
        		
        	}
        	else
        	{
        		RequestDispatcher rd = request.getRequestDispatcher("ErrorPageOrder.jsp");
        		rd.forward(request, response);
        		       		
        	}
        }
		
        catch(Exception e)
        {
        	e.printStackTrace();
        }
		
	}

}
