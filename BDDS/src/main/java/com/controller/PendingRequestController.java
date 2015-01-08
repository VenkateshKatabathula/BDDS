package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.services.PendingRequestService;
import com.servicesfactory.ServiceFactory;

@WebServlet("/PendingRequestController")
public class PendingRequestController extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    response.setContentType("text/html");
    int orderID=Integer.parseInt(request.getParameter("orderID"));
    PendingRequestService service=ServiceFactory.getPendingRequestService();
    int res=0;
	try {
		res = service.getPendingRequestService(orderID);
	} 
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    if(res>0)
	{
    	RequestDispatcher rd = request.getRequestDispatcher("PendingRequestsPage.jsp");
		rd.forward(request,response);
	}
	else
	{
		RequestDispatcher rd = request.getRequestDispatcher("ErrorPageRequests.html");
		rd.forward(request,response);
		
	}
    }
}
