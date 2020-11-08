CREATE TABLE UserInfo(FirstName varchar(30),LastName varchar(30),Gender char(8),DateOfBirth Date,UserID varchar(30),Password varchar(30));
insert into sba1dbschema.userinfo(FirstName,LastName,Gender,DateOfBirth,UserID,Password) values (?,?,?,?,?,?);
select UserID, Password from sba1dbschema.userinfo;

CREATE TABLE LoanInfo(LoanNumber int, LoanPurpose varchar(20), LoanAmount double, LoanAppliedDate Date,BusinessStructure varchar(20),
BillingIndicator varchar(20), TaxIndicator varchar(20), Address varchar(50), EmailID varchar(30), MobileNo int, LoanStatus varchar(10));
insert into sba1dbschema.LoanInfo(LoanNumber,LoanPurpose, LoanAmount,LoanAppliedDate,BusinessStructure,BillingIndicator, TaxIndicator,Address, EmailID, MobileNo,LoanStatus)
values(?,?,?,?,?,?,?,?,?,?,?);
select LoanStatus from LoanInfo where LoanNumber='%s'
