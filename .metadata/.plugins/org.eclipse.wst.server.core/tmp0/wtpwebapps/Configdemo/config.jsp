<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.print("Welcome "+request.getParameter("driv"));
String driver=config.getInitParameter("name");
out.print(" this is your driver: "+driver);
%>
</body>
</html>