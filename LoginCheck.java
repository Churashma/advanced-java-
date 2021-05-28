<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login </title>
</head>
<body>
<% String uname=request.getParameter("uname");
String password=request.getParameter("password");
if(uname.equals("churashma") && password.equals("churashma"))
{
out.println("welcome to coding");
}
else
{
out.println("Invalid entry");
}
%>
</body>
</html>
