package com.nit.exception.Sept16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionProblem1 {

//	You have to raise an ArithmeticException and handle it by providing some user friendly message.
	public void div(int a,int b) {
		try {
			System.out.println("Div : "+(a/b));
		}
		catch(ArithmeticException e) {
			System.out.println("Can't Divide by 0");
//			e.initCause(e);
			e.getMessage();
		}
	}
	
//	Raise a NumberFormatException and handle it by providing some user friendly message.
	public void convert(String str) {
		try {
			int num=Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println("Can't convert the String");
		}
	}
	
//	InputMismatchException
	public void readInt() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter integer value ");
			int n=sc.nextInt();
			System.out.println(n);
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException : Enter only Integer");
		}
	}
	
	
//	NullPointerException
	public void convertUpperCase(String name) {
		try {
			String upper=name.toUpperCase();
			System.out.println(upper);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("name should not be null");
//			e.initCause(e);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ExceptionProblem1 e1=new ExceptionProblem1();
		e1.div(10, 0);
		e1.convert("Hello");
//		e1.readInt();
		e1.convertUpperCase(null);
	}

}
