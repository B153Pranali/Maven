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

	<tr>
		<td><label for="Name" >First Name:</label></td>
		<td><input type="text" id="Name" name="First Name"></td>
	</tr><br>

	<tr>
		<td><label for="MiddleName" >Middle Name:</label></td>
		<td><input type="text" id="MiddleName" name="Middle Name"></td>
	</tr><br>

	<tr>
		<td><label for="last" >Last Name:</label></td>
		<td><input type="text" id="last" name="Last Name"></td>
	</tr><br>

	<tr>
		<td><label for="last" >Course:</label>
		<select><option>Course</option></select></td>
	</tr><br>

	<tr>
		<td><label for="last" >Gender:</label>
		<br>
		<input type="checkbox" id="dr" name="hob">
		<lable for="dr">Male</lable>
		<br>
		<input type="checkbox" id="sg" name="hob">
		<lable for="sg">Female</lable>
		<br>
		<input type="checkbox" id="sg" name="hob">
		<lable for="sg">other</lable>
</td>
	</tr><br>

	<tr>
		<td><label for="mo" >Mobile No:</label></td>
		<select><option>+91</option></select></td>
		<td><input type="tel" id="mo" name="mo" patten=[0-9]{10}></td>
	</tr><br>

	<tr>
		<td><label for="last" >Address:</label><br>
	
		<textarea cols="100" row="25"></textarea></td></tr><br>

	<tr>
		<td><label for="Email" >Email:</label></td>
		<td><input type="email" id="Email" name="Email"></td>
	</tr><br>

	<tr>
		<td><label for="Password" >Password:</label></td>
		<td><input type="password" id="Password" name="Password"></td>
	</tr><br>

	<tr>
		<td><label for="re-typePassword" >Re-Type Password:</label></td>
		<td><input type="password" id="re-typePassword" name="re-typePassword"></td>
	</tr><br>
<tr><td"><a href="suc"><input type="submit"></a></td></tr>


</body>
</html>