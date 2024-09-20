package com.nit.exception.Sept16;

public class ExceptionMCQ5 {
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println(m1());
		System.out.println("main end");

	}

	static public int m1() {
		try {
			System.out.println("In try");
			int a = 10;
			int b = 0;
			int result = a / b;
			return result;
		} catch (NumberFormatException e) {
			System.out.println("In catch");
			return 20;
		} 
//		 catch(ArithmeticException e) {
//			System.out.println("In catch");
//			return 20;
//		} 
		finally {
			System.out.println("In finally");
			int[] a = new int[-10];
			return 10;
		}
	}
}


/* 
D)main start
In try
In finally
Exception in thread “main” java.lang.NegativeArraySizeException */
