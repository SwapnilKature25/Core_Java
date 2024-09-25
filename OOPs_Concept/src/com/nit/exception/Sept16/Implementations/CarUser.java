package com.nit.exception.Sept16.Implementations;

import com.nit.exception.Sept16.customException.CarHeatExeption;
import com.nit.exception.Sept16.customException.CarPunctureExeption;
import com.nit.exception.Sept16.customException.CarStoppedExeption;
import com.nit.exception.Sept16.requirement.CarRequirements;

public class CarUser implements CarRequirements {

	@Override
	public void carStop(String message) throws CarStoppedExeption {
		if(message.equalsIgnoreCase("break")) {
			throw new CarStoppedExeption
			("Break Applied Car stoped!!!");
		}
		else {
			System.out.println
			("Car running good enjoy the music and ride slow!!!");
		}
	}

	@Override
	public void carPuncture(String message) throws CarPunctureExeption {
		if(message.equalsIgnoreCase("puncture")) {
			throw new CarPunctureExeption
			("Take the car to garage tyre issue is there!!");
		}
		else {
			System.out.println
			 ("Car running good enjoy the music and ride slow!!!");
		}

	}

	@Override
	public void carHeat(int temp) throws CarHeatExeption {
		if(temp > 50) {
			throw new CarHeatExeption
			("Take a break buddy i need some rest ");
		}
		else {
			System.out.println
            ("ARE YOU A OLD PERSON ACC LET'S GO BROOMMMMMM BROOMMMM");
		}

	}

}
