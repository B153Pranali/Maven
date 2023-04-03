<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Sucussesfulyyy login....
<table border="2">
<tr>
<th>Name</th>
<th>username</th>
<th>password</th>
<th>Email</th>

</tr>

<tr>
<td>${u.firstname}</td>
<td>${u.username}</td>
<td>${u.password}</td>
<td>${u.email}</td>
</tr>


</table>
</body>
</html>