package com.demo.eligibility;

import java.io.Serializable;

public class EligibilityResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6249606666562369210L;

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
