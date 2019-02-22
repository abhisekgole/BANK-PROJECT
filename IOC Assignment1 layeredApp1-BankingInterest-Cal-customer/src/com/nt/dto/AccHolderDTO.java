package com.nt.dto;
import java.io.Serializable;

public class AccHolderDTO implements Serializable{

	private long accNo;
	private String accHolderName;
	private String accHolderAdd;
	private double principalAmt;
	private int time;
	private int rateOfInterest;
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getAccHolderAdd() {
		return accHolderAdd;
	}
	public void setAccHolderAdd(String accHolderAdd) {
		this.accHolderAdd = accHolderAdd;
	}
	public double getPrincipalAmt() {
		return principalAmt;
	}
	public void setPrincipalAmt(double principalAmt) {
		this.principalAmt = principalAmt;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
}
