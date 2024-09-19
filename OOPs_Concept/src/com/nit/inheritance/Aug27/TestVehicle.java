package com.nit.inheritance.Aug27;

class Vehicle{
	String make;
	String model;
	int year;
	
	Vehicle(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	public void displayDetails()
	{
		if(year <=0) {
			System.out.println("Error Invalid Input");
		}
		else {
			System.out.println("Make in "+make);
			System.out.println("Model no : "+model);
			System.out.println("Manufacturer year : "+year);
		}
	}
}

class Car extends Vehicle{
	int numberOfDoors;
	
	Car(String make, String model, int year, int numberOfDoors)
	{
		super(make,model,year);
		this.numberOfDoors=numberOfDoors;
	}
	
	public void displayDetails()
	{
		if(numberOfDoors <=0) {
			System.out.println("Error Invalid Input");
		}
		else {
			System.out.println("Make in "+make);
			System.out.println("Model no : "+model);
			System.out.println("Manufacturer year : "+year);
		}
	}
}

class Bike extends Vehicle{
	String type;
	Bike(String make,String model,int year,String type)
	{
		super(make,model,year);
		this.type=type;		
	}
	public void displayDetails()
	{
		System.out.println("Make in "+make);
		System.out.println("Model no : "+model);
		System.out.println("Manufacturer year : "+year);
		System.out.println("Vehicle Type : "+type);
	}
}
public class TestVehicle {

	public static void main(String[] args) {
		Car car = new Car("Audi", "Q8", 2021, 0);
        System.out.println("Car Details:");
        car.displayDetails();

        Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
        System.out.println("\nBike Details:");
        bike.displayDetails();

	}

}
