package com.nit.exception.Sept16;


public class ArithmeticExceptionDemo {
	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			e.getMessage();
		}
	}
}


// wap to demonstrate ArrayindexoutofboundException