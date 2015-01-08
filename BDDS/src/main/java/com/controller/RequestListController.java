package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.ListBeans;
import com.beans.RegistrationBean;

@WebServlet("/RequestListController")
public class RequestListController extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	
    	response.setContentType("text/html");
    	ListBeans listBean = new ListBeans();
    	
    	//listBean.
    	
    }
    	
}
