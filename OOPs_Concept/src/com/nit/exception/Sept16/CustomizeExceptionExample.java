package com.nit.exception.Sept16;

public class CustomizeExceptionExample {
	void show(int a) throws MyException {
		System.out.println("Hello Custom Exception");
		int b = a / 0;
	}

	public static void main(String[] args) {
		CustomizeExceptionExample obj = new CustomizeExceptionExample();
		obj.show(5);
		System.out.println("Bye Custom Exception");
	}
}

class MyException extends Exception {
	MyException() {
		super();
	}

	MyException(String name) {
		super(name);
	}
}