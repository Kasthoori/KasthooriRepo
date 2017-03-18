<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Page</h1>
<form action="RegistreDetailsServlet" method="post" name="frm2">
	<table>
		<tr>
			<td>User Name: <input type="text" name="username" /></td>
		</tr>
		<tr>
			<td>Password: <input type="text" name="password" /></td>
		</tr>
		<tr>
			<td>First Name: <input type="text" name="fname" /></td>
		</tr>
		<tr>
			<td>Last Name: <input type="text" name="lname" /></td>
		</tr>
		<tr>
			<td>Sex: <input type="radio" name="sex" value="M" />Male<input type="radio" name="sex" value="F" />Female</td>
		</tr>
		<tr>
			<td>Department:
			
			      <select name="dep">
  						<option value="">-----Select-------</option>
  						<option value="Eng">Engineering</option>
  						<option value="sup">Supply</option>
  						<option value="acc">Account</option>
				</select>
			
			
			</td>
		</tr>
		<tr>
			<td>Occupation: 
			
			<select name="occupation">
  						<option value="">-----Select-------</option>
  						<option value="Engineer">Engineer</option>
  						<option value="suppclerk">Supply Clerk</option>
  						<option value="accountant">Accountant</option>
				</select>
			
		   </td>
		</tr>
		<tr>
			<td>
				Email:<input type="text" name="email" />
			</td>
		</tr>
		<tr>
			<td><input type="submit" name="Register" /><input type="Reset" name="Reset" /></td>
		</tr>
	</table>
</form>
</body>
</html>