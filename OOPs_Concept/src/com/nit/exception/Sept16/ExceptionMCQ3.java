package com.nit.exception.Sept16;

import java.util.*;

public class ExceptionMCQ3 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number for a and b");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = a / b;
			System.out.println("The result is :" + result);
		} catch (ArithmeticException e) {
			System.out.println("don’t divide the number with 0");
		} catch (InputMismatchException ne) {
			System.out.println("don’t enter anything apart from int");
		} catch (Exception e) {
			System.out.println("Exception raised");
		}
	}
}
//[Assume: b=0,a=5]