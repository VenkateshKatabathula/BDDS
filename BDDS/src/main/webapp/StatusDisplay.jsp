<%@ page import="java.sql.ResultSet" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find your Order Status</title>
</head>
<body>

	<% ResultSet res=(ResultSet)request.getAttribute("status"); %>
	<%while(res.next()) 
	{%>
<table>
<tr>
	<th>
		OrderID
	</th>
	<th>Status</th>
	</tr>
	<tr>
		<td>
			<%=res.getInt(1) %>
		</td>
		<td>
			<%=res.getString(5) %>	
		</td>
	</tr>
</table>
	
<%	}%>
</body>
</html>