package org.leapyear;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class LeapYearTest {

	@Test
	void isLeapYear() {
		boolean isLeapYear = LeapYear.isLeapYear(2000);
		Assert.assertTrue(isLeapYear);
	}
	
	@Test
	void isNotLeapYear() {
		boolean isLeapYear = LeapYear.isLeapYear(1999);
		Assert.assertFalse(isLeapYear);
	}
}
