package com.nit.exception.Sept16;

class Animal{
	String name;
	int age;
	Animal(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "Animal[ name : "+name+", age : "+age+"]";
	}
}

public class DogExample extends Animal{
	
	DogExample(String name, int age) {
		super(name, age);
	}
	
	public String toString() {
		return "Dog "+ super.toString();
	}
	
	public void printDogDetails() {
		System.out.println("Dog Details : "+toString());
	}
	
//	ClassCastException
	public static void printDetails(Animal animal) {
		try {
			DogExample d=(DogExample)animal;
			d.printDogDetails();
		}
		catch(ClassCastException e) {
			System.err.println("The provided animal is not Dog ");
		}
	}

	
	
	public static void main(String[] args) {
		Animal animal=new Animal("Category",10);
		DogExample monty=new DogExample("monty",10);
//		printDetails(animal);
		printDetails(monty);
		

	}

}
