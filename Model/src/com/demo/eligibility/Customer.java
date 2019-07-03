package com.demo.eligibility;

import java.io.Serializable;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5283221687056547290L;

	private boolean eligibility = false;

	public boolean isEligibility() {
		return eligibility;
	}

	public void setEligibility(boolean eligibility) {
		this.eligibility = eligibility;
	}

}
