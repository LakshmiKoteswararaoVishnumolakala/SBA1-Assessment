package com.iiht.evaluation.eloan.model;

import java.util.Date;

public class LoanInfo {
	
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
	 
	 @Override
	public String toString() {
		return "LoanInfo [LoanNumber=" + LoanNumber + ", LoanPurpose=" + LoanPurpose + ", LoanAmount=" + LoanAmount
				+ ", LoanAppliedDate=" + LoanAppliedDate + ", BusinessStructure=" + BusinessStructure
				+ ", BillingIndicator=" + BillingIndicator + ", TaxIndicator=" + TaxIndicator + ", Address=" + Address
				+ ", EmailID=" + EmailID + ", MobileNo=" + MobileNo + ", LoanStatus=" + LoanStatus
				+ ", getLoanNumber()=" + getLoanNumber() + ", getLoanPurpose()=" + getLoanPurpose()
				+ ", getLoanAmount()=" + getLoanAmount() + ", getLoanAppliedDate()=" + getLoanAppliedDate()
				+ ", getBusinessStructure()=" + getBusinessStructure() + ", getBillingIndicator()="
				+ getBillingIndicator() + ", getTaxIndicator()=" + getTaxIndicator() + ", getAddress()=" + getAddress()
				+ ", getEmailID()=" + getEmailID() + ", getMobileNo()=" + getMobileNo() + ", getLoanStatus()="
				+ getLoanStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}		 
	 public LoanInfo(int loanNumber, String loanPurpose, double loanAmount, Date loanAppliedDate,
				String businessStructure, String billingIndicator, String taxIndicator, String address, String emailID,
				int mobileNo, String loanStatus) {
			super();
			LoanNumber = loanNumber;
			LoanPurpose = loanPurpose;
			LoanAmount = loanAmount;
			LoanAppliedDate = loanAppliedDate;
			BusinessStructure = businessStructure;
			BillingIndicator = billingIndicator;
			TaxIndicator = taxIndicator;
			Address = address;
			EmailID = emailID;
			MobileNo = mobileNo;
			LoanStatus = loanStatus;
		}
	 public LoanInfo() 
	 {
		 
	 }
	 
	 public int getLoanNumber() 
	 {
		return LoanNumber;
	}

	public void setLoanNumber(int loanNumber) {
		LoanNumber = loanNumber;
	}

	public String getLoanPurpose() {
		return LoanPurpose;
	}

	public void setLoanPurpose(String loanPurpose) {
		LoanPurpose = loanPurpose;
	}

	public double getLoanAmount() {
		return LoanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		LoanAmount = loanAmount;
	}

	public Date getLoanAppliedDate() {
		return LoanAppliedDate;
	}

	public void setLoanAppliedDate(Date loanAppliedDate) {
		LoanAppliedDate = loanAppliedDate;
	}

	public String getBusinessStructure() {
		return BusinessStructure;
	}

	public void setBusinessStructure(String businessStructure) {
		BusinessStructure = businessStructure;
	}

	public String getBillingIndicator() {
		return BillingIndicator;
	}

	public void setBillingIndicator(String billingIndicator) {
		BillingIndicator = billingIndicator;
	}

	public String getTaxIndicator() {
		return TaxIndicator;
	}

	public void setTaxIndicator(String taxIndicator) {
		TaxIndicator = taxIndicator;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmailID() {
		return EmailID;
	}

	public void setEmailID(String emailID) {
		EmailID = emailID;
	}

	public int getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}

	public String getLoanStatus() {
		return LoanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		LoanStatus = loanStatus;
	}
}
