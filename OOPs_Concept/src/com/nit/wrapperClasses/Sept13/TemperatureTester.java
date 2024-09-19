package com.nit.wrapperClasses.Sept13;

public class TemperatureTester {

	public static void main(String[] args) {
		Temperature t=new Temperature();
		t.setCelsius(25.0);
		System.out.println("The Fahrenheit temperature is "+t.convertToFahrenheit());
	}

}

//The Fahrenheit temperature is 77