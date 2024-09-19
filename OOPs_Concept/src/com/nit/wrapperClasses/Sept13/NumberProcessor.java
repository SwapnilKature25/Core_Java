package com.nit.wrapperClasses.Sept13;

public class NumberProcessor {
	private int number;
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public Integer squareNumber() {
		return (int)Math.pow(getNumber(), 2);
	}
	
	public Integer doubleNumber() {
		return (int)(getNumber() * 2);
	}
	
	public String toString() {
		return "Number : "+getNumber()+"\nSquare of Number : "+squareNumber()+"\nDouble number : "+doubleNumber();
	}
}
