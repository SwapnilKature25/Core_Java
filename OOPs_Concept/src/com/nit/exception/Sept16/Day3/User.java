package com.nit.exception.Sept16.Day3;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
//		PasswordValidator pv=new PasswordValidator();
		 
		try {
			System.out.println("Enter a password to validate : ");
			Scanner sc=new Scanner(System.in);
			String pass=sc.next();
			System.out.println(PasswordValidator.validatePassword(pass));
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
