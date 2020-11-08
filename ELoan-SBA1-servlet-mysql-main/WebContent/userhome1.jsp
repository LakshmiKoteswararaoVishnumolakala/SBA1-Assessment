<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home Page</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr/>
	<!-- write the html code to display hyperlinks for user functionalities -->
<div align="right"><a href="index.jsp">Logout</a></div>
<h2>User Dash Board</h2>
<a href="user?action=application1"> Apply for New Loan</a><br>
<a href="user?action=editloan"> Track Loan</a><br>
<a href="user?action=editloan"> Edit Loan</a><br>
<hr/>
<jsp:include page="footer.jsp"/>
</body>
</html>
