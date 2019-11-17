<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@page session="false" %>
    
    <%String msg = (String) request.getAttribute("msg");%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee</title>
</head>
<body>

<%if(msg != null && !msg.isEmpty()){ %>
<h3><%=msg%></h3>
<%} %>
<fieldset>
		<legend>Add Employee</legend>
		<form action="./addEmployeeForm" method="post">
			<table>
				<tr>
					<td>Employee ID</td>
					<td>:</td>
					<td><input type="number" name="empId" required></td>
				</tr>

				<tr>
					<td>Employee Name</td>
					<td>:</td>
					<td><input type="text" name="empName" required></td>
				</tr>
				
				<tr>
					<td>Age</td>
					<td>:</td>
					<td><input type="number" name="age" required></td>
				</tr>

				<tr>
					<td>Employee Salary</td>
					<td>:</td>
					<td><input type="number" name="salary" required></td>
				</tr>

				<tr>
					<td>Gender</td>
					<td>:</td>
					<td><input type="text" name="gender" required></td>
				</tr>

				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password" required></td>
				</tr>

				<tr>
					<td>Mobile number</td>
					<td>:</td>
					<td><input type="number" name="mobile" required></td>
				</tr>

				<tr>
					<td colspan="3" align="center"><br>
					<input type="submit" value="Add">
					</td>
				</tr>
			</table>
		</form>

	</fieldset>

</body>
</html>