<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Submit Test</title>
</head>
<body>
	
	<center><h2>${headerMsg}</h2></center>
	College has processed below data.<br><br>
	<table>
		<tr>
			<td>Student's name:</td><td>${student1.studentName}</td>
		</tr>
		
		<tr>
			<td>Student's hobby:</td><td>${student1.studentHobby}</td>
		</tr>
		
		<tr>
			<td>Student's Mobile:</td><td>${student1.studentMobile}</td>
		</tr>
		
		<tr>
			<td>Student's DOB:</td><td>${student1.studentDOB}</td>
		</tr>
		
		<tr>
			<td>Student's skills:</td><td>${student1.studentSkills}</td>
		</tr>
		
		<tr>
			<td>Student's address:</td>
			<td>country : ${student1.studentAddress.country}
				city : ${student1.studentAddress.city}
				street : ${student1.studentAddress.street}
				pin code : ${student1.studentAddress.pincode}
			</td>
		</tr>
	</table>
</body>
</html>