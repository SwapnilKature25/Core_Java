package com.nit.wrapperClasses.Sept13;

public class Temperature {
	private double celsius;
	
	public void setCelsius(double celsius) {
		this.celsius=celsius;
	}
	
	public double getCelsius() {
		return celsius;
	}
	
	public Integer convertToFahrenheit() {
		return (int)Math.round((getCelsius() * 9.0/5.0)+32);
	}
}
