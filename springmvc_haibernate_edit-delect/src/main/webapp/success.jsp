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
done.........
<table border="2">
<tr>
<th>RollNo</th>
<th>Name</th>
<th>username</th>
<th>password</th>
<th>Action</th>
</tr>
<c:forEach items="${data}" var="s">
<tr>
<td>${s.rollNo}</td>
<td>${s.name}</td>
<td>${s.userName}</td>
<td>${s.password}</td>
<td><a href="edit?rollNo=${s.rollNo}">Edit</a>||<a href="delete?rollNo=${s.rollNo}">Delete</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>