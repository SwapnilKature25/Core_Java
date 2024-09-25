package com.nit.exception.Sept16.requirement;


import com.nit.exception.Sept16.customException.CarHeatExeption;
import com.nit.exception.Sept16.customException.CarPunctureExeption;
import com.nit.exception.Sept16.customException.CarStoppedExeption;

public interface CarRequirements {

	public void carStop(String message) throws CarStoppedExeption;
	public void carPuncture(String message) throws CarPunctureExeption;
	public void carHeat(int temp) throws CarHeatExeption;
}
