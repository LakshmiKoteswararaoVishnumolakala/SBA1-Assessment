<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- write html code to read the application number and send to usercontrollers'
             displaystatus method for displaying the information
	-->
<jsp:include page="header.jsp"/>
<hr/>
<div align=center>
<div align="right"><a href="userhome1.jsp">Go Back to Home Page</a></div>
	<h2>Track Loan Details</h2>		
	<form action="user?action=displaystatus" method="post">				
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