<%@page import="com.beans.OrderBean"%>
<%@ page import="java.sql.ResultSet" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pending Requests</title>
</head>
<h3>The requests are:</h3>
<body>
<p align="right"><a href="adminPage.html" >Go to Home</a></p>
<p align="right"><a href="loggedout.html" >Logout</a></p>
<%ResultSet rs=(ResultSet)request.getAttribute("order"); %>

<form action="PendingRequestController" method="post">
<table align="center" cellpadding="4" cellspacing="4">
<tr>
	<th>Order id</th><th>Order Price</th><th>Status</th>
</tr>
<%while(rs.next()){ %>
	<tr><td><%=rs.getInt(1)%></td><td><%=rs.getInt(4)%></td><td><%=rs.getString(5) %></td>
	<td>
		<input type="radio"  value="<%=rs.getInt(1)%>" name="orderID" />
	</td>
	</tr>

<%} %>
</table>
<p align="center"> <input  type="submit" value="Accept request"></p>
</form>
</body>
</html>