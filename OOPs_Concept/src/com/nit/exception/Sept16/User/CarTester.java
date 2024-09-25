package com.nit.exception.Sept16.User;

import com.nit.exception.Sept16.Implementations.CarUser;
import com.nit.exception.Sept16.customException.CarPunctureExeption;
import com.nit.exception.Sept16.customException.CarStoppedExeption;
import com.nit.exception.Sept16.requirement.CarRequirements;

public class CarTester {
	public static void main(String[] args) {
		CarRequirements c=new CarUser();
		try {
			c.carPuncture("puncture");
		}
		catch(CarPunctureExeption e) {
			System.out.println(e.getMessage());
		}
	}
}
