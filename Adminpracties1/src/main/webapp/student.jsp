<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:powderblue;">

<h2>Registration Form Student</h2>
<table>
<form action="suc">
	<tr>
		<td><label for="Name" >First Name:</label></td>
		<td><input type="text" id="Name" name="firstName"></td>
	</tr><br>

	<tr>
		<td><label for="last" >Last Name:</label></td>
		<td><input type="text" id="last" name="lastName"></td>
	</tr><br>

	<tr>
		<td><label for="last" >Course:</label>
		<select><option>Course</option></select></td>
	</tr><br>

	<tr>
		<td><label for="last" >Gender:</label>
		<br>
		<input type="checkbox" value="male" name="gender">
		<lable for="male">Male</lable>
		<br>
		<input type="checkbox" value="female" name="gender">
		<lable for="female">Female</lable>
		<br>
		<input type="checkbox" value="other" name="gender">
		<lable for="other">other</lable>
</td>
	</tr><br>

	<tr>
		<td><label for="mo" >Mobile No:</label></td>
		<select><option>+91</option></select></td>
		<td><input type="tel" id="mo" name="mobile" patten=[0-9]{10}></td>
	</tr><br>

	<tr>
		<td><label for="last" >Address:</label><br>
	
		<textarea cols="100" row="25" name="address"></textarea></td></tr><br>

	<tr>
		<td><label for="Email" >Email:</label></td>
		<td><input type="email" id="Email" name="Email"></td>
	</tr><br>

	<tr>
		<td><label for="Password" >Password:</label></td>
		<td><input type="password" id="Password" name="Password"></td>
	</tr><br>

	
<tr><td><input type="submit"></td></tr>
</form>
</table>
</body>
</html>