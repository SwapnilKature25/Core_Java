package com.nit.exception.Sept16;

public class ExceptionMCQ4 {
public static void main(String[] args)
{
System.out.println("main start");
System.out.println(m1(5));
System.out.println("main end");
}

	public static int m1(int a) {
		while (a++ == 5) {
			try {
				return 10;
			} finally {
			}
		}
		return 20;
	}
}

/* 
main start
10
main end */