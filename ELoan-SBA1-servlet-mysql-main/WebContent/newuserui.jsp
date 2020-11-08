<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User Registration</title>
</head>
<body>
	<!-- read user name and password from user to create account
	     and send to user controllers register user method
	-->
<jsp:include page="header.jsp"/>
<hr/>
<div align ="center">
<div align="right"><a href="index.jsp">Go Back to Login Page</a></div>
	<h2>New User Registration</h2>
	<form action="user?action=registernewuser" method="post">		
		<div>
			<label> Enter First Name</label>	
			<input type ="text" name="FirstName"/>
		</div> <br> 
		<div>
			<label> Enter Last Name</label>	
			<input type ="text" name="LastName"/>
		</div>
		<br> 		
		<div>
			<label for="Gender">Select Gender</label>
			<select name="Gender" id="Gender">
			  <option value="Male">Male</option>		
			  <option value="Female">Female</option>		
			</select>
		</div>
		<br> 
		<div>
			<label> Enter Date of Birth</label>
			<input type="text" name ="DateOfBirth"/>
		</div>
		<br> 
		<div>
			<label>User ID</label>	
			<input type ="text" name="UserID"/>
		</div> <br> 
		<div>
			<label> Password</label>	
			<input type ="text" name="Password"/>
		</div>		
		<br> 
		<div>
			<input type ="submit" value ="Register"/>
		</div>
	</form>
</div>
<hr/>
<jsp:include page="footer.jsp"/>


</body>
</html>