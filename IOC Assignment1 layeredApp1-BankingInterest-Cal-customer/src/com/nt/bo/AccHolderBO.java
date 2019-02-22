package com.nt.bo;

public class AccHolderBO {
	/*
	 * ACCNO NUMBER(10) PRIMARY KEY, ACCHOLDERNAME VARCHAR2(10), CADD VARCHAR2(10),
	 * PRICIPAL NUMBER(10,2), SIMPLEINT NUMBER(10,2), COMPOUNDINT NUMBER(10,2))
	 */
	private long accno;
	private String accHolderName;
	private String accHolderAdd;
	private double principalAmt;
	private double simpleInt;
	private double compoundInt;
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getcAdd() {
		return accHolderAdd;
	}
	public void setcAdd(String accHolderAdd) {
		this.accHolderAdd = accHolderAdd;
	}
	public double getPrincipalAmt() {
		return principalAmt;
	}
	public void setPrincipalAmt(double principalAmt) {
		this.principalAmt = principalAmt;
	}
	public double getSimpleInt() {
		return simpleInt;
	}
	public void setSimpleInt(double simpleInt) {
		this.simpleInt = simpleInt;
	}
	public double getCompoundInt() {
		return compoundInt;
	}
	public void setCompoundInt(double compoundInt) {
		this.compoundInt = compoundInt;
	}
}
