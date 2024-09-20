package com.nit.exception.Sept16;

public class ExceptionMCQ12 {
	public int m1(int a) {
		System.out.println("m1 started");
		try {
			while (a == 5) {
				try {
					System.out.println("inside loop");
					++a;

				} finally {
					return 10;
				}
			}
		}
		finally {
			System.out.println("outside loop");
//			here priority is given to finally return value compare to inside finally value
//			return 20;
		}
		return 20;
	}

	public static void main(String[] args) {
		ExceptionMCQ12 e3 = new ExceptionMCQ12();
		System.out.println(e3.m1(5));
	}
}

/* m1 started
inside loop
outside loop
10 */