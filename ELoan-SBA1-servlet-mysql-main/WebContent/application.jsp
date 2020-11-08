<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Loan Application Form</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

</head>
<body onload="myFunction()">
<!--
	write the html code to accept loan info from user and send to placeloan servlet	
-->
</script>
<jsp:include page="header.jsp"/>

<hr/>
<div align="right"><a href="userhome1.jsp">Go Back to Home Page</a></div>
	<%
		int loanApplicationNumber =100000+(int) (Math.random()*(1000000-100000)+1);		
	%>
<div align=center>
	<h2>New Loan Application Request</h2>			
	<form action="applicationConfirmation" method="post">	
	   <div>
	     <label>Loan Application #</label>
  		<input type="text" name="LoanNumber" value="<%=loanApplicationNumber %>" readonly/>
  	   </div><br>  	  
		<div>
			<label> Loan Purpose</label>	
			<input type ="text" name="LoanPurpose"/>
		</div><br>	
			<div>
			<label> Loan Amount</label>
			<input type="text" name ="LoanAmount"/>
		</div><br>	
		<div>		
			<label>Loan Applied Date #</label>				
			<input type="text" name="LoanAppliedDate" value="<%=(new java.util.Date()).toLocaleString() %>" readonly/>
	   </div><br>	
		<div>
			<label for="BusinessStructure">Select Business Structure</label>
			<select name="BusinessStructure" id="BusinessStructure">
			  <option value="Individual">Individual</option>		
			  <option value="Organization">Organization</option>		
			</select>
		</div><br>
		<div>
			<label for="BillingIndicator">Select Billing Indicator</label>
			<select name="BillingIndicator" id="BillingIndicator">
			  <option value="Salaried">Salaried</option>		
			  <option value="Self Employee">SelfEmployee</option>		
			</select>
		</div><br>
		<div>
			<label for="TaxIndicator">Select Tax Indicator</label>
			<select name="TaxIndicator" id="TaxIndicator">
			  <option value="Tax Payer">TaxPayer</option>		
			  <option value="Not Paying Tax">NotPayingTax</option>		
			</select>
		</div><br>
		<div>
			<label>Address </label>
			<input type="text" name ="Address"/>	
		</div><br>
		<div>
			<label>Email ID</label>
			<input type="text" name ="EmailID"/>
		</div><br>
		<div>		
			<label>Enter Mobile #</label>
			<input type="text" name ="MobileNo"/>
		</div><br> 
		<div>
			<label>Status</label>
			<input type="text" name ="LoanStatus" value="In Progress" readonly/>
		</div><br>
		<div>
			<input type ="submit" value ="Apply"/>
		</div>		
	</form>
</div>
<hr/>
<jsp:include page="footer.jsp"/>
</body>
</html>