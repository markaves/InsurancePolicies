package com.orangeandbronze.jbc.insurancepolicy;

import java.math.*;
import java.time.*;

import com.orangeandbronze.jbc.insurancepolicy.vehicle.*;

import junit.framework.*;

public class TestMotorPolicy extends TestCase {

	public void testGetPremium() throws Exception {
		PolicyHolder holder = new PolicyHolder(1, "Mickey", "Mouse");
		Vehicle vehicle = new Vehicle(Make.TOYOTA, BodyType.SEDAN, 2013);
		Policy policy = new MotorPolicy(1, holder, vehicle);
		BigDecimal actual = policy.getPremium(2017);
		BigDecimal expected = new BigDecimal("2600.00");
		assertEquals(expected, actual);
	}

}
