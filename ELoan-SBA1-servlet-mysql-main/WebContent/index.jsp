<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IIHT Finance Services Limited</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr/>
<div align=center>
	<h2>eLoan Login</h2>		
	<form action="user?action=validate" method="post">
			<div>
				<label for="Relation">Select Relationship with Bank:</label>
				<select name="BankRelationship" id="BankRelationship">
				  <option value="User">User</option>		
				  <option value="Admin">Admin</option>			 	
				</select>
			</div><br>			
			<div>
				<div><label for="UserID">Enter User ID:</label> </div>
				<div><input type="text" id="UserID" name="UserID"> </div>
			</div>
		<div>
			<div><label for="Password">Enter password:</label> </div>
			<div><input type="text" id="Password" name="Password"> </div>
		</div><br>	
		<div>
			<div><input type="submit" value="Login"> </div>
		</div>
	</form>
		<hr/>
			<a href="user?action=register"> New User?Register here</a>
</div>
<hr/>
<jsp:include page="footer.jsp"/>
</body>
</html>