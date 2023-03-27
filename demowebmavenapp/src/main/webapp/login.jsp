<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1" style="border-collapse:collapse">
	<from action="Day5.html">
<tr>
		<td><label for="fn">First Name </label></td>
		<td><input type="text" id="fn" name="FirstName" placeholder="Enter First Name" autocomplete="off" required></td>
</tr>
<tr>
		<td><label for="ln">Last Name</lable></td>
		<td><input type="text" id="ln" name="LastName"></td>
</tr>
<tr>
		<td><label for="em">Email </label></td>
		<td><input type="text" id="em" name="email"></td>
</tr>
<tr>
		<td><label for="dt">Date of Birth</lable></td>
		<td><input type="date" id="dt" name="DateOfBirth"></td>
</tr>
<tr>
		<td><label for="mb">Mobile No</lable></td>
		<td><input type="tel" id="mb" name="mobileno"></td>
</tr>
<tr>
		<td><input type="Submit"></td>
</tr>
	</table>
	
</body>
</html>