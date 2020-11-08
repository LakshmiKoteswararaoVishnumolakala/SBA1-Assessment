package com.iiht.evaluation.eloan.dto;

import java.util.Date;

public class LoanDto {
	private static String applno="sssssd";
	private static int amtRequested=30000;
	private static int emi =20000;
	 private int LoanNumber;
	 private String LoanPurpose;
	 private double LoanAmount;
	 private Date LoanAppliedDate;
	 private String BusinessStructure;
	 private String BillingIndicator;
	 private String TaxIndicator;
	 private String Address;
	 private String EmailID;
	 private int MobileNo;
	 private String LoanStatus;	
	public LoanDto() {
		
	}
	public LoanDto(String applno, int amtRequested, int emi) {
		super();
		LoanDto.applno = applno;
		LoanDto.amtRequested = amtRequested;
	}
	public static String getApplno() {
		return applno;
	}
	public void setApplno(String applno) {
		LoanDto.applno = applno;
	}
	public static int getAmtRequested() {
		return amtRequested;
	}
	public void setAmtRequested(int amtRequested) {
		LoanDto.amtRequested = amtRequested;
	}
	public static int getEmi() {
		return emi;
	}
	public void setEmi(int emi) {
		LoanDto.emi = emi;
	}
	
	public static void main(String[] args)
	{
		System.out.println(applno+":"+amtRequested+":"+emi);
	}
	
	
	
}
