<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Login</legend>
		<!-- <form action="./login" method="post"> -->
		<!--login-->
		<!-- <form action="./login2" method="post"> -->
		<!--login 2-->
		<!-- <form action="./login3" method="post"> -->
		<!--login 3-->
		<form action="./login4" method="post">
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
				
				<tr>
					<td>DOB</td>
					<td>:</td>
					<td><input type="Date" name="date"></td>
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