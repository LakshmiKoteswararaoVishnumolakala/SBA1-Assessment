package com.iiht.evaluation.eloan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.iiht.evaluation.eloan.dto.LoanDto;
import com.iiht.evaluation.eloan.model.ApprovedLoan;
import com.iiht.evaluation.eloan.model.LoanInfo;
import com.iiht.evaluation.eloan.model.User;

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
	System.out.println(inserUserSQL);

		jdbcConnection =this.connect();
		System.out.println("hello");
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
	
}
