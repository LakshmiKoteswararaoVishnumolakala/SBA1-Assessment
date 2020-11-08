package com.iiht.evaluation.eloan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.iiht.evaluation.eloan.dto.LoanDto;
import com.iiht.evaluation.eloan.model.ApprovedLoan;
import com.iiht.evaluation.eloan.model.LoanInfo;
import com.iiht.evaluation.eloan.model.User;
import com.mysql.cj.xdevapi.Result;

public class ConnectionDao 
{
	private static final long serialVersionUID = 1L;
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	//public static String UserID;
	//public static String Password;
	private static Connection jdbcConnection;

	public ConnectionDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
        }

	public  Connection connect() throws SQLException {
		//if (jdbcConnection == null || jdbcConnection.isClosed()) 
		//{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
			} 
			catch (ClassNotFoundException e) 
			{
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		//}
		return jdbcConnection;
	}

	public void disconnect() throws SQLException {
	//	if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		//}
	}
	// put the relevant DAO methods here..
	public void insertUserInfo(String FirstName,String LastName, String Gender,String DateOfBirth,String UserID,String Password) throws SQLException
	{
		String inserUserSQL = "insert into sba1dbschema.userinfo(FirstName,LastName,Gender,DateOfBirth,UserID,Password) values (?,?,?,?,?,?)";		
		//System.out.println(inserUserSQL);

		jdbcConnection =this.connect();
		//System.out.println("hello");
		PreparedStatement pstmt= jdbcConnection.prepareStatement(inserUserSQL);		
		pstmt.setString(1,FirstName);
		pstmt.setString(2,LastName);
		pstmt.setString(3,Gender);
		pstmt.setString(4,DateOfBirth);
		pstmt.setString(5,UserID);
		pstmt.setString(6,Password);	
		
		pstmt.execute();		
		pstmt.close();
		
		this.disconnect();		
	}
	
	public boolean insertLoanInfo(String loanNumber, String loanPurpose, String loanAmount, String loanAppliedDate,
			String businessStructure, String billingIndicator, String taxIndicator, String address, String emailID,
			String mobileNo, String loanStatus) 
	{
		boolean resultFlag;
		String insertLoanInfoSQL = "insert into sba1dbschema.LoanInfo(LoanNumber,LoanPurpose, LoanAmount,LoanAppliedDate,BusinessStructure,BillingIndicator, TaxIndicator,Address, EmailID, MobileNo,LoanStatus)\r\n" + 
				"values(?,?,?,?,?,?,?,?,?,?,?);";		
		//System.out.println(inserUserSQL);

		try {
			jdbcConnection =this.connect();
			PreparedStatement pstmt= jdbcConnection.prepareStatement(insertLoanInfoSQL);		
			pstmt.setString(1,loanNumber);
			pstmt.setString(2,loanPurpose);
			pstmt.setString(3,loanAmount);
			pstmt.setString(4,loanAppliedDate);
			pstmt.setString(5,businessStructure);
			pstmt.setString(6,billingIndicator);	
			pstmt.setString(7,taxIndicator);
			pstmt.setString(8,address);
			pstmt.setString(9,emailID);
			pstmt.setString(10,mobileNo);
			pstmt.setString(11,loanStatus);
			
			pstmt.execute();		
			pstmt.close();
			resultFlag =true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultFlag = false;
		}
		//System.out.println("hello");
		finally
		{
			try 
			{
				this.disconnect();
			} 
			catch (SQLException e) 
			{
				System.out.println("Error : "+ e.getMessage());
			}
		}
		
		return  resultFlag;
	}
	
	
	
	 
	
	
	public HashMap<String, String> getUserCredentials()
	{
		Statement stmt = null;
		HashMap<String, String> cred_map = new HashMap<String, String>();
		String getUserCred = "select UserID, Password from sba1dbschema.userinfo";

		try 
		{
			jdbcConnection =this.connect();
			stmt = jdbcConnection.createStatement();
			ResultSet rs= stmt.executeQuery(getUserCred);
			while(rs.next())
			{
				cred_map.put(rs.getString("UserID"), rs.getString("Password"));
			}
			return cred_map;
		} 
		catch(Exception e)
		{
			System.out.println("Unable to fetch User credential data");
			System.out.println("Error : "+e.getMessage());
			return cred_map;
		}
		finally 
		{
			try 
			{
				stmt.close();
				this.disconnect();
			} 
			catch (SQLException e) 
			{
				System.out.println("Error : "+ e.getMessage());
			}
		}	
	}
	

	static final String GetLoanStatus = "select LoanStatus from LoanInfo where LoanNumber='%s'";
	public String getLoanStatus(String LoanNumber) 
	{	
		Connection conn = null;
		Statement stmt = null;
		String LoanStatus = null;	
		 try 
		 {
	        	jdbcConnection = this.connect();
	        	stmt = jdbcConnection.createStatement();
	        	ResultSet rs = stmt.executeQuery(String.format(GetLoanStatus, LoanNumber));        	
	        	while(rs.next())
	        	{
					System.out.println(rs.getString("LoanStatus"));
					
					LoanStatus = rs.getString("LoanStatus");
					System.out.println("Loan "+LoanNumber+" is :" + LoanStatus);
				}
				return LoanStatus;
		 }
	     catch(Exception e) 
		 {
	        	System.out.println("Unable to fetch Loan status");
	        	System.out.println("Error : "+e.getMessage());
				return LoanStatus;
	     }
	        finally 
			{
				try 
				{
					stmt.close();
					this.disconnect();
				} 
				catch (SQLException e) 
				{
					System.out.println("Error : "+ e.getMessage());
				}
			}
	 }

	
}
