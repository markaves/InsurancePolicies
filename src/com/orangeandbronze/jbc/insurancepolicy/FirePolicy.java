package com.orangeandbronze.jbc.insurancepolicy;

import java.math.BigDecimal;
import java.time.Year;

import com.orangeandbronze.jbc.insurancepolicy.property.Property;

public class FirePolicy extends Policy {
	private Property property; 

	public FirePolicy(int i, PolicyHolder holder, Property property) {		
		super(i, holder);
		this.property = property;
	}
	
	public Property getProperty() {
		return property;
	}
	
	public void setProperty(Property property) {
	  this.property = property;
	}
	
	@Override
	public BigDecimal getPremium(int year) {		
		BigDecimal premium = new BigDecimal((property.getSizeInSqareMeters()*10) + (year - property.getYearBuilt())*100);
		return premium.setScale(2);
	}
}
