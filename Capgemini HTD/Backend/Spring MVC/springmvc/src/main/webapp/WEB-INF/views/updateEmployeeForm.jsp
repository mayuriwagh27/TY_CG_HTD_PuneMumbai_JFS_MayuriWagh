<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page session ="false" %>
     <%String msg = (String) request.getAttribute("msg");%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%if(msg != null && !msg.isEmpty()){ %>
<h3><%=msg %></h3>
<%} %>
<fieldset>
		<legend>Update Employee</legend>
		<form action="./updateEmployeeForm" method="post">
			<table>
				<tr>
					<td>Employee ID</td>
					<td>:</td>
					<td><input type="number" name="empId" required></td>
				</tr>

				<tr>
					<td>Employee Name</td>
					<td>:</td>
					<td><input type="text" name="empName" ></td>
				</tr>

				<tr>
					<td>Age</td>
					<td>:</td>
					<td><input type="number" name="age" ></td>
				</tr>

				<tr>
					<td>Employee Salary</td>
					<td>:</td>
					<td><input type="number" name="salary" ></td>
				</tr>

				<tr>
					<td>Gender</td>
					<td>:</td>
					<td><input type="text" name="gender" ></td>
				</tr>

				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password" ></td>
				</tr>

				<tr>
					<td>Mobile number</td>
					<td>:</td>
					<td><input type="number" name="mobile" ></td>
				</tr>

				<tr>
					<td colspan="3" align="center"><br>
					 <input type="submit"value="Update Details">
						</td>
				</tr>

			</table>
		</form>
	</fieldset>

</body>
</html>