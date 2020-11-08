<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
	<!-- write the html code to display hyperlinks for user functionalities -->
	<div align="right"><a href="index.jsp">Logout</a></div>
	<h4>Thank you for applying the loan. Our Admin Services team will review it and Get back to you soon.</h4>
	<a href="userhome1.jsp">Go Back to Home Page</a><br>
	<a href=trackloan.jsp> Track Loan</a><br>
	<a href=editloan.jsp> Edit Loan</a><br>
	<jsp:include page="footer.jsp"/>
</body>
</body>
</html>