<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% String msg = (String) request.getAttribute("msg"); %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href ="./createCookie">click Here </a> to create cookie...<br>
<a href ="./readCookie">click Here </a> to see cookies...<br>

<% if(msg != null && !msg.isEmpty()) { %>
<%=msg %>
<%} %>
</body>
</html>