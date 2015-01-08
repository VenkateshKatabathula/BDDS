

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BiharBakery</title>
<script type="text/javascript">

function customername(a,b){
	var exp=/^[A-Za-z]{3,10}$/;
	if(b!="")
	{
		if(!b.match(exp))
		{
			alert("enter a valid customername");
			document.myform.name.value="";
		}
	}
	else
		{
		alert("customer name cannot be null")
		document.myform.name.focus();
		}
	
}

function Username(a,b){
	var exp=/^[A-Za-z]{3,10}$/;
	if(b!=""){
		if(!b.match(exp)){
			alert("enter a valid username");
			document.myform.username.value="";
		}
	}
	else
	{
	alert("user name cannot be null")
	document.myform.name.focus();
	}
	
}

function password1(a,b){
	var exp=/^[A-Za-z]{3,10}$/;
	if(b=="")
	    {			
			alert("this field cannot be left blank");
			document.myform.password.value="";
		}
		/* if(document.myform.password.value="")
		{
		alert("this field cannot be left blank");
		} */
		else
			{
			if(!b.match(exp))
				alert("enter valid password");
			}
}
	

	
function password2(a,b){
	var exp=/^[A-Za-z]{3,10}$/;
	if(b=="")
	{
		
			alert("this field cannot be left blank");
			document.myform.repassword.value="";
		}
	else
		{
	if(document.myform.repassword.value!=document.myform.password.value)
		
		alert("Both passwords are not matching!!!");
	document.myform.repassword.focus();
		}		
}
	
function emailid(a,b){
		var exp=/^\w+[@]{1}\w+[\.]{1}[A-Z a-z]+[\.]{0,1}[A-Z a-z]+$/;
		if(b!="")
		{
		if(!b.match(exp))
		 {
		  alert("enter a valid email id");
		  document.myform.email.value="";
		 }
	}
		else
			{
			alert("this field cannot be left blank");
			document.myform.email.value="";
			}
		
}
	     
function notnul(a,b){
		
		if(b==""){
			
				alert("this field cannot be left blank");
				document.myform.userid1.value="";
			}
		if(document.myform.userid1.value="")
			alert("this field cannot be left blank");
		}
		
	
function mobile(a,b)
	{
	 var exp=/^[0-9]{10}$/;
	 if(b!=""){
	 if(!b.match(exp))
	 {
	  alert("Phone number must contain 10 numbers");
	  document.myform.mobilenumber.value="";
	  }
	 }
	 else
		 {
	 alert("this field cannot be left blank");
		document.myform.mobilenumber.value="";
		 }
	}
	
function validateForm()
{
	
	if(document.myform.name.value="")
	{
	alert("customer name should not be null");
	document.myform.name.focus();
	}
	
	if(document.myform.username.value="")
	{
	alert("user name should not be null");
	document.myform.name.focus();
	}
	
	if(document.myform.password.value="")
	{
	alert("password should not be null");
	document.myform.name.focus();
	}
	
	if(document.myform.repassword.value="")
	{
	alert("repassword should not be null");
	document.myform.name.focus();
	}
	
	if(document.myform.email.value="")
	{
	alert("email should not be null");
	document.myform.name.focus();
	}
	
	if(document.myform.mobilenumber.value="")
	{
	alert("mobilenumber should not be null");
	document.myform.name.focus();
	}
	
	if(document.myform.address.value="")
	{
	alert("address should not be null");
	document.myform.name.focus();
	}
	
}

</script>

</head>
<body bgcolor="#FFEBCD">

<h2 align="center" ><font color="magenta"> REGISTRATION PAGE</font></h2>
<hr>
<h3 align="center"> please provide your details:</h3>


<form name="myForm" action="RegistrationController"  method="post" onSubmit="return validateForm()">
 <table align="center">
<tr>
<td>Customer Name</td><td><input type="text" name="name" onblur="customername(this.id,this.value)"></td>
</tr>
<tr>
<td>User Name</td><td><input type="text" name="username"class="required" onblur="Username(this.id,this.value)"/></td>
</tr>
<tr>
<td>Password</td><td><input type="password" name="password"class="required" value=""  onblur="password1(this.id,this.value)"/></td>
</tr>
<tr>
<td>Re-enter Password</td><td><input type="password" name="repassword"class="required" value=""  onblur="password2(this.id,this.value)"/></td>
</tr>
<tr>
<td>Gender</td><td>
				<input type="Radio" name="gender" value="M"> M
				 <input type="Radio" name="gender" value="F" > F</td>
</tr>
				 
<tr>
<td>Email-id</td><td>
    			<input type="text" name="email" onblur="emailid(this.id,this.value)"></td>
 </tr>				 
<tr><td>Enter your Mobile Number
	<br>Mobile </td>
<td><input type="text" name="mobilenumber" onblur="mobile(this.id,this.value)" ></td>
</tr>
<tr><td>Address For delivering items
<br>Address</td><td><br><textarea rows="4" cols="50" class="required" name="address" onblur="notnul(this.id,this.value)"></textarea></td></tr>
	<tr>    
		<td>
			<input type="submit" value="register"/>
		</td>
		<td>
		<input type="reset"/>
		</td>
</tr>
</table>
</form>
</body>
</html>