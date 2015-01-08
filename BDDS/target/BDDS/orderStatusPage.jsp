<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
	
function validate(a,b)
{
 var exp=/^[0-9]{2}$/;
 if(b!=""){
 if(!b.match(exp))
 {
  alert("Order ID contains only numbers");
  document.statusForm.orderID.value="";
  }
 }
 else
	 {
 alert("this field cannot be left blank");
	document.statusForm.orderID.value="";
	 }
}



function validat()
{
	if(document.statusForm.orderID.value=="")
		{
		alert("abc");
		return false;		
		}
	return true;
}


	
</script>
<body>
	
	<form name="statusForm" action="OrderStatusController" method="post" onsubmit="return validat()">
		<table>
			<tr>
				<td>Enter order ID to find the status : </td>
				
			</tr>
			<tr>
				<td><input type="text" name="orderID" onblur="validate(this.id,this.value)"/></td>
			</tr>
			<tr><td><input type="submit" /></td></tr>
		</table>
	</form>
	
</body>
</html>