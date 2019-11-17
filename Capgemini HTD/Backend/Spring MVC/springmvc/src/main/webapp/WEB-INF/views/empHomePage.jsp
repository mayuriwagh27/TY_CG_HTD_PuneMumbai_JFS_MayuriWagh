<%@page import="com.capgemini.springmvc.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session = "false" %>
    
    <% HttpSession session = request.getSession(false); %>
    <% EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) session.getAttribute("employeeInfoBean"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Welcome <%=employeeInfoBean.getEmpName() %>!</h3>
<a href="./addEmployeeForm">Add Employee</a><br>
<a href="./updateEmployeeForm">Update Employee</a><br>
<a href="./deleteEmployee">Delete Employee</a><br>
<a href="./searchEmployee">Search Employee</a><br>
<a href="./seeAllEmployee">See All Employee</a><br>

<a href="./logout">Logout</a>

</body>
</html>