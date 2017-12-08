package com.orangeandbronze.jbc.insurancepolicy;

import java.math.BigDecimal;

import com.orangeandbronze.jbc.insurancepolicy.property.Property;
import com.orangeandbronze.jbc.insurancepolicy.vehicle.Vehicle;

public class MotorPolicy extends Policy {
	private Vehicle vehicle;	
	
	public MotorPolicy(int i, PolicyHolder holder, Vehicle vehicle) {		
		super(i, holder);
		this.vehicle = vehicle;
	}
	
	public Vehicle getProperty() {
		return vehicle;
	}
	
	public void setProperty(Vehicle vehicle) {
	  this.vehicle = vehicle;
	}

	@Override
	public BigDecimal getPremium(int year) {
		
		BigDecimal premium = new BigDecimal("1000.00"); //Base Premium
		premium = premium.add(vehicle.getMake().premiumAddition); //Make
		premium = premium.multiply(vehicle.getBodyType().premiumMultiplier); //Body Type
		BigDecimal age = new BigDecimal((year - vehicle.getYear())*200); //Age Multiplier		
		premium = premium.add(age);	
		return premium.setScale(2);
	}
}
