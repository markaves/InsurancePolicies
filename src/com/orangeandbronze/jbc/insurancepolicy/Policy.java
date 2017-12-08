package com.orangeandbronze.jbc.insurancepolicy;

import java.math.*;
import java.time.*;

public abstract class Policy {
	
	private final Integer policyNumber;
	private PolicyHolder policyHolder;
	
	public Policy(Integer policyNumber, PolicyHolder policyHolder) {
		this.policyNumber = policyNumber;
		this.policyHolder = policyHolder;
	}
	
	public Integer getPolicyNumber() {
		return policyNumber;
	}
	
	public PolicyHolder getPolicyHolder() {
		return policyHolder;
	}
	
	/** Computes the premium to be paid for a given year.**/
	public abstract BigDecimal getPremium(int year);
}
