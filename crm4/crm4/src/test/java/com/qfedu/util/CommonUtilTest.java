package com.qfedu.util;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

// Keep your bar green!
// Hamcrest
public class CommonUtilTest {
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void testDivide() {
		System.out.println(1 / 0);
	}
	
	@Test
	public void testRandomInt() {
		for (int i = 1; i <= 10000; ++i) {
			int num = CommonUtil.randomInt(1, 100);
			assertThat(num, allOf(
					greaterThanOrEqualTo(1), 
					lessThanOrEqualTo(100)));
		}
	}

	@Test
	public void testIsValidForTriangle() {
		assertTrue(CommonUtil.isValidForTriangle(3, 4, 5));
		assertTrue(CommonUtil.isValidForTriangle(3, 3, 3));
		assertFalse(CommonUtil.isValidForTriangle(1, 2, 3));
	}
	
	@Test(timeout = 1000)
	public void testFactorial() {
		assertEquals(120, CommonUtil.factorial(5), 0.1);
		assertEquals(1, CommonUtil.factorial(1), 0.1);
		assertEquals(1, CommonUtil.factorial(0), 0.1);
		assertEquals(6, CommonUtil.factorial(3), 0.1);
	}
}
