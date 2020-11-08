<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Loan Application</title>
</head>
<body>
	<!-- read the application number to edit from user and send to 
	     user controller to edit info
	-->
<jsp:include page="header.jsp"/>
<hr/>
<div align=center>
<div align="right"><a href="userhome1.jsp">Go Back to Home Page</a></div>
	<h2>Edit Loan Details</h2>		
	<form action="user?action=editLoanProcess" method="post">				
		<div>
				<div><label for="LoanApplictionNo">Enter Loan Application Number:</label> </div>
				<div><input type="text" id="LoanApplicationNo" name="LoanApplicationNo"> </div>
		</div>	<br>
		<div>
			<div><input type="submit" value="Submit"> </div>
		</div>	
	
	</form>
</div>
<hr/>
<jsp:include page="footer.jsp"/>
</body>
</html>