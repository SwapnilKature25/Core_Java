package com.nit.exception.Sept16.Day3;

class InvalidPasswordException extends Exception{

	public InvalidPasswordException(String message) {
		super(message);
	}
}

public class PasswordValidator {
	static String validatePassword(String password) throws InvalidPasswordException {
		int lwr=0, upr=0,digit=0,spe=0,space=0;
		if(password.length() >= 8) {
			for(int i=0; i<password.length(); i++) {
				if(password.charAt(i) >='A' && password.charAt(i) <='Z') {
					upr++;
					if(upr == 0) {
						System.out.println(" Password must contain at least one uppercase letter.");
					}
				}
				else if(password.charAt(i) >='a' && password.charAt(i) <='z')
				{
					lwr++;
					if(lwr==0) {
						System.out.println(" Password must contain at least one lowercase letter.");
					}
				}
				else if(password.charAt(i) >='0' && password.charAt(i) <='9') {
					digit++;
				}
				else if(password.charAt(i) == ' ') {
					space++;
					if(space >= 1) {
						System.out.println("Password must not contain any spaces.");
					}					
				}
				else {
					spe++;
					if(spe == 0) {
						System.out.println("Password must contain at least one special symbol.");
					}
				}
			}
		}
		else {
			System.out.println("Password must be at least 8 characters long.");
		}
		
		if(lwr >= 1 && upr >= 1 && digit >= 1 && spe >= 1 && space==0) {
			return "Password successfully validated!";
		}
		else {
			throw new InvalidPasswordException("Invalid Password, Please Try Again...");
		}
	}
}
