package com.nit.exception.Sept16.Day_2;


public class ExceptionMCQ1 {
public static void main(String[] args) {

// try {
//     String str = "abc";
//     int num = Integer.parseInt(str);
//     System.out.println(num);
//     } catch (NumberFormatException e) {
//     System.out.println("Invalid number format.");
//     } finally {
//     System.out.println("Finally block executed.");
//     }

 //Invalid number format.
// Finally block executed.
 
 
// try {
//	 int[] arr = new int[3];
//	 arr[3] = 5;
//	 } catch (ArrayIndexOutOfBoundsException e) {
//	 System.out.println("Array index out of bounds");  
//	 }
// 	Array index out of bounds
 
 	
 
 
//	String s = "null";
//	if (s == null) {
//		System.out.println(s.length());
//	} else {
//		throw new NullPointerException();
//	}
	
//	NullPointerException	
 
 
 
	int[] arr = new int[3];
	try {
		arr[2] = '5';
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index out of bounds.");
	} catch (Exception e) {
		System.out.println("An error occurred.");
	}
//	Nothing is output, as the program terminates before any output is produced.
//	System.out.println(arr[2]);
	
	
	
	
//	try {
//		int num = Integer.parseInt("abc");
//		System.out.println(num);
//		} catch (NumberFormatException e) {
//		System.out.println("Invalid number format.");
//		}
//	NumberFormatException
 
	
	
	
	try {
		System.out.print("Naresh" + ""+ 20 / 0 + " IT");
		} catch (ArithmeticException e) {
		System.out.print("Naresh IT ");
		}
//	Naresh IT
	
	
	
	
	try {
		int num = Integer.parseInt(args[0]);
		if (num < 0) {
		throw new IllegalArgumentException();
		}
		System.out.println(num);
		} catch (IllegalArgumentException e) {
		System.out.println("Invalid argument");
		}
//	ArrayIndexOutOfBoundException

 
 	
}
}
