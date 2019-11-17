<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<% String msg = (String) request.getAttribute("msg") ;%>
	
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Login</title>
</head>
<body>

<% if (msg != null && !msg.isEmpty()){ %>
<h3 style='color:red'><%=msg %></h3>
<%} %>
	<fieldset>
		<legend>Login</legend>
		
		<form action="./empLogin" method="post">
			<table>
				<tr>
					<td>Employee Id</td>
					<td>:</td>
					<td><input type="text" name="empId"></td>

				</tr>

				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					<td colspan="3" align="center"><br> <input type="submit"
						value="Login"></td>

				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>