<%@page import="com.capgemini.springmvc.beans.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<!-- Scriptlel JSP tag -->
<% /* String empId = (String)request.getAttribute("empId"); */
//for second & third method of login
 /* int empId = (int) request.getAttribute("empId");  
 String password = (String)request.getAttribute("pwd");
		 */
		/* login 4 */
		 UserBean userBean = (UserBean) request.getAttribute("userBean"); 
%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--login 2 & 3  -->
<%-- Entered Employee Id = <%=empId %><br>     
Entered password = <%=password %> --%>


<!--login 4 (Expression JSP tag) -->
 Entered Employee Id = <%=userBean.getEmpId()%><br>
Entered password = <%=userBean.getPassword() %><br>
Entered DOB = <%=userBean.getDob() %>           

</body>
</html>