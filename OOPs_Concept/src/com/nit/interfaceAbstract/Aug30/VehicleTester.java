package com.nit.interfaceAbstract.Aug30;

/*
wap for the below requirement.
Create an abstract method , create 3 sub-classes at the same level,
complete the abstract method in all the sub-classes.
*/

abstract class Vehicle{
	public abstract void noOfWheels();
}

class Car extends Vehicle{
	@Override
	public void noOfWheels() {
		System.out.println("noOfWheels in Car : 4");
	}
}

class Truck extends Vehicle{
	@Override
	public void noOfWheels() {
		System.out.println("noOfWheels in Truck : 12");
	}
}

class Auto extends Vehicle{
	@Override
	public void noOfWheels() {
		System.out.println("noOfWheels in Auto : 3");
	}
}


public class VehicleTester {

	public static void main(String[] args) {
		Car c=new Car();
		c.noOfWheels();
		Truck t=new Truck();
		t.noOfWheels();
		Auto a=new Auto();
		a.noOfWheels();
	}

}
