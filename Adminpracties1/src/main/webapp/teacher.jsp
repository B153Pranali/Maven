<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Registration Form</h2>
<form action="sucess">
	<table border="1" style="border-collapse:collapse">
	
<tr>
		<td><label for="fn">First Name </label></td>
		<td><input type="text" id="fn" name="firstName" placeholder="Enter First Name" autocomplete="off" required></td>
</tr>
<tr>
		<td><label for="ln">Last Name</lable></td>
		<td><input type="text" id="ln" name="lastName"></td>
</tr>
<tr>
		<td><label for="em">Email </label></td>
		<td><input type="text" id="em" name="email"></td>
</tr>
<tr>
		<td><label for="dt">Date of Birth</lable></td>
		<td><input type="date" id="dt" name="dateOfBirth"></td>
</tr>

<tr>
		<td><input type="Submit"></td>
</tr>

	</table>
	</form>
</body>
</html>