package com.orangeandbronze.jbc.insurancepolicy.console;

import java.math.*;
import java.time.*;

import com.orangeandbronze.jbc.insurancepolicy.*;
import com.orangeandbronze.jbc.insurancepolicy.property.*;

public class TestFirePolicy  {
  

	public static void main(String[] args) {
		PolicyHolder holder = new PolicyHolder(1, "Mickey", "Mouse");
		Property property = new Property(1998, 400);
		Policy policy = new FirePolicy(1, holder, property);
		BigDecimal actual = policy.getPremium(2017);
		BigDecimal expected = new BigDecimal("5900.00");
		System.out.println("Expected premium is: " + expected);
		System.out.println("Actual premium is: " + actual);
	}

}
