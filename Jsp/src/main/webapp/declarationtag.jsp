<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--<%!int a=10; %>
<%="do u know 5*2 is "+a %>"field declaration"-->

<%! int add(int n1,int n2)
{
	return n1+n2;
}
%>
<%="Addition of two no is: "+add(8,7) %>
</body>
</html>