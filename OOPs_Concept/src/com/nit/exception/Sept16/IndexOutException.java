package com.nit.exception.Sept16;

public class IndexOutException {
	public static void main(String[] args) {
		int arr[]= {12,23,45};
		try {
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array element is beyond the index");
			e.printStackTrace();
		}
	}
}
