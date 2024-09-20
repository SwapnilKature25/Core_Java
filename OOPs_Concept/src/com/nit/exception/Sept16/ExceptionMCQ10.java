package com.nit.exception.Sept16;

public class ExceptionMCQ10 {
	public int m1(int a) {
		while (a == 5) {
			try {
				try {
					a = 10;
				}

				finally {
					a = 20;
				}
				System.out.println("a= "+a);
				a = 30;
				return a;
			} finally {
				if (a == 30) {
					System.out.println("True a==30");
					continue;
				}
			}
		}
		return 40;
	}

	public static void main(String[] args) {
		ExceptionMCQ10 e4 = new ExceptionMCQ10();
		System.out.println(e4.m1(5));		//40
	}
}
