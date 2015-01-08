<%@ page import="java.sql.ResultSet" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
</head>
<body background="images/bakery2.jpg" >
<form action="UpdateItemList" method="post">
<%
	ResultSet rs = (ResultSet)request.getAttribute("var");
%>
<table align="center"cellspacing="10" cellpadding="10">

<tr>
	<th>Item ID</th>
	<th>Item Name</th>
	<th>Item quantity</th>
	<th>Units to Add </th>
</tr>
<% if(rs.next())
{ %>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(4) %></td>
<td><input type="text" name="quantity1" /></td></tr>
<%} %>
<% if(rs.next())
{ %>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(4) %></td>
<td><input type="text" name="quantity2" /></td></tr>
<%} %>

<% if(rs.next())
{ %>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(4) %></td>
<td><input type="text" name="quantity3" /></td></tr>
<%} %>

<% if(rs.next())
{ %>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(4) %></td>
<td><input type="text" name="quantity4" /></td></tr>
<%} %>

<% if(rs.next())
{ %>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(4) %></td>
<td><input type="text" name="quantity5" /></td></tr>
<%} %>

</table>
<p align="center"><input type="submit" value="Add Items">
<input type="reset" ></p>
</form>

</body>
</html>