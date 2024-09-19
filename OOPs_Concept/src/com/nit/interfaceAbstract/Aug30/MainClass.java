package com.nit.interfaceAbstract.Aug30;

abstract class Animal{
	public abstract void makeSound();
	public abstract void run();
}

abstract class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Bark");
	}
}

class Cat extends Dog{
	@Override
	public void run() {
		System.out.println("Running");
	}
}
public class MainClass {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.run();
		c.makeSound();

	}

}



/*
wap for the below requirement.
Create an abstract method , create 3 sub-classes at the same level,
complete the abstract method in all the sub-classes.
*/














