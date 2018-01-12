<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center><h2>${headerMsg}</h2></center>
	
	<link rel="stylesheet" href="<spring:theme code='stylesheet'/>" type="text/css" />
	
	<p><a href="/SpringMVC/admissionForm.html?siteTheme=green">Green</a> | 
	<a href="/SpringMVC/admissionForm.html?siteTheme=red">Red</a>
	</p>
	
	<h3>Student's Admission Form</h3>
	<font color="red">
		<form:errors path="student1.*"/>
	</font>
	
	<form action="/SpringMVC/submitAdmission.html" method="post">
	
		<table>
			<tr>
				<td>Student's Name:</td><td><input type="text" name="studentName"/></td>
				<td><font color="red"><form:errors path="student1.studentName"/></font></td>
			</tr>
		
			<tr>
				<td>Student's Hobby:</td><td><input type="text" name="studentHobby"/></td>
				<td><font color="red"><form:errors path="student1.studentHobby"/></font></td>
			</tr>
			
			<tr>
				<td>Student's Mobile no</td><td><input type="text" name="studentMobile"/></td>
				<td><font color="red"><form:errors path="student1.studentMobile"/></font></td>
			</tr>
			
			<tr>
				<td>Student's DOB (dd/mm/yyyy)</td><td><input type="text" name="studentDOB"/></td>
				<td><font color="red"><form:errors path="student1.studentDOB"/></font></td>
			</tr>
			
			<tr>
				<td>Student's skills</td><td><select name="studentSkills">
												<option value="core java">Core java</option>
												<option value="advanced java">Advanced java</option>
												<option value="spring mvc">Spring MVC</option>
											</select></td>
			</tr>
			
			
			
		</table>
		<br><br>
		<table>
			<tr><td>Student's Address</td></tr>
			<tr>
				<td>country :</td><td> <input type="text" name="studentAddress.country"></td>
			</tr>
			<tr>
				<td>city :</td><td> <input type="text" name="studentAddress.city"></td>
			</tr>
			<tr>
				<td>street :</td><td> <input type="text" name="studentAddress.street"></td>
			</tr>
			<tr>
				<td>pin code :</td><td> <input type="text" name="studentAddress.pincode"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
		
	</form>
	
</body>
</html>