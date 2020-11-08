<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admin home</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<hr/>
<div align="right"><a href="index.jsp">Logout</a></div>
<h2>Admin Dash Board</h2>
<a href="admin?action=listall">List All</a><br>
<a href="admin?action=process">Process Loan</a><br>
<hr/>
<jsp:include page="footer.jsp"/>
</body>
</html>