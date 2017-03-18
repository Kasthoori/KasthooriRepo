<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Success</h1>

<%

		request.getSession();

        String user = (String)request.getAttribute("User");
        
        

%>

    <h2>Hi! <%= user %></h2>
    
    <a href="GetUserDetailsServlet?item=<%= user %>">List &nbsp; <%= user %> &nbsp; details</a>
    
    
    

</body>
</html>