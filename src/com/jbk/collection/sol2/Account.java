package com.jbk.collection.sol2;

public class Account {
	
	private int acNo;
	private String acName;
	private double acBal;

	public Account() {
	}

	public Account(int acNo, String acName, double acBal) {
		super();
		this.acNo = acNo;
		this.acName = acName;
		this.acBal = acBal;
	}

	public int getAcNo() {
		return acNo;
	}

	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	public double getAcBal() {
		return acBal;
	}

	public void setAcBal(double acBal) {
		this.acBal = acBal;
	}

	@Override
	public String toString() {
		return "Account [acNo=" + acNo + ", acName=" + acName + ", acBal=" + acBal ;
	}

}
