package com.orangeandbronze.jbc.insurancepolicy;

import java.math.*;
import java.time.*;

import com.orangeandbronze.jbc.insurancepolicy.property.*;

import junit.framework.*;

public class TestFirePolicy extends TestCase {

	public void testGetPremium() {
		PolicyHolder holder = new PolicyHolder(1, "Mickey", "Mouse");
		Property property = new Property(1998, 400);
		Policy policy = new FirePolicy(1, holder, property);
		BigDecimal actual = policy.getPremium(2017);
		BigDecimal expected = new BigDecimal("5900.00");
		assertEquals(expected, actual);
	}

}
