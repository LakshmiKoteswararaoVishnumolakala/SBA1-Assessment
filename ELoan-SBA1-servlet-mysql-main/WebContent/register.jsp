<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Page</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr/>
<div align ="center">
	<h2>New User Registration</h2>
	<form action="newuserui" method="post">		
		<div>
			<label> Enter First Name</label>	
			<input type ="text" name="First Name"/>
		</div> <br> 
		<div>
			<label> Enter Last Name</label>	
			<input type ="text" name="Last Name"/>
		</div>
		<br> 		
		<div>
			<label for="gender">Select Gender</label>
			<select name="gender" id="Gender">
			  <option value="Male">Male</option>		
			  <option value="Female">Female</option>		
			</select>
		</div>
		<br> 
		<div>
			<label> Enter Date of Birth</label>
			<input type="text" name ="Date Of Birth"/>
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
			<input type ="submit" value ="registerUser"/>
		</div>
	</form>
</div>
<hr/>
<jsp:include page="footer.jsp"/>
</body>
</html>