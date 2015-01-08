package com.controller;

import com.beans.LoginBean;
import com.exceptions.UserNotFoundException;

import com.services.LoginService;
import com.servicesfactory.ServiceFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
   
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String userName;
        userName = request.getParameter("login");
        String password = request.getParameter("password");
        try 
        {
             
             String role = "";
             LoginBean loginInfo = new LoginBean( );
             loginInfo.setUserName(userName);
             loginInfo.setPassword(password);
             LoginService loginService = ServiceFactory.getLoginService();
             try
             {
            	 role = loginService.validateUser(loginInfo);
            	 System.out.println(role);
             }
             catch(ClassNotFoundException ce)
             {
            	 ce.printStackTrace();            	 
             }
             catch(SQLException se){
            	 se.printStackTrace( );
            	 
             }
             if( role.equalsIgnoreCase("ADMIN"))
             {
            	 
            	 HttpSession session = request.getSession();
            	 session.setAttribute("userName",userName);
            	 RequestDispatcher rd = request.getRequestDispatcher("adminPage.html");
            	 rd.forward(request, response);
             }

             else if( role.equalsIgnoreCase("USER"))
             {
            	 HttpSession session = request.getSession();
            	 session.setAttribute("userName",userName);
            	 RequestDispatcher rd = request.getRequestDispatcher("/ItemsList");
            	 rd.forward(request, response);
             }

             else
             {
            	 throw new UserNotFoundException("User "+userName+" not Found");
             }
             
        }
        catch(UserNotFoundException e)
        {
        	HttpSession session = request.getSession();
        	session.setAttribute("userName",userName);
       	 	RequestDispatcher rd = request.getRequestDispatcher("LoginError.html");
       	 	rd.forward(request, response);
        }
         finally { 
            out.close();
        }
    } 

    
   

}
