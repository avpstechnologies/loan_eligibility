package com.demo.eligibility;

import java.io.Serializable;

public class EligibilityRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2207578446618569745L;

	private int age;

	private String state;
	
	private int loanAmount;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

}
