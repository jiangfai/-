package com.qfedu.util;

import static java.lang.System.*;

public final class CommonUtil {
	
	private CommonUtil() {
		throw new AssertionError();
		// Throwable
		//		- Error
		// 		- AssertionError
		// 		- OutOfMemoryError - heap
		//			- StackOverflowError - stack
		//		- Exception
		//			- RuntimeException
		//				- NumberFormatException
		//				- NullPointerException
		//				- IndexOutOfBoundsException
		//				- ClassCastException
		//				- ArithmeticException
		//				- NegativeArraySizeException
		//			- IOException
		//			- SQLException
		//			- ClassNotFoundException
	}
	
	public static boolean isValidForTriangle(double a, double b, double c) {
		assert a > 0 && b > 0 && c > 0;
		return a + b > c && b + c > a && a + c > b;
	}
	
	public static double factorial(int n) {
		assert n >= 0;
		if (n == 0 || n == 1) return 1;
		return n * factorial(n - 1);
	}
	
	public static int randomInt(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
	
	public static void main(String[] args) {
		out.println("Hello");
		out.println(isValidForTriangle(-1, -2, -3));
	}
}
