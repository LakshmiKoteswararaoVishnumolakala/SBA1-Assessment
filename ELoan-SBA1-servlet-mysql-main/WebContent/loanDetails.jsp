<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- write the code to display the loan status information 
	     received from usercontrollers' displaystatus method
	-->
<% 

String amt = request.getAttribute("amount").toString();
%>
	<div>
			<label> Loan Amount</label>
			<input type="text" name ="LoanAmount" value =<%=amt %>/>
		</div><br>	

</body>
</html>