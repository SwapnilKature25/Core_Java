package com.nit.inheritance.Aug27;

class Student
{
	protected String name;
	protected int rollNumber;
	
	Student(String name,int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
	}
	
	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}


	public void displayDetails()
	{
		System.out.println("Student Name : "+name);
		System.out.println("Student Roll No : "+rollNumber);
	}
	
	public double calculatePercentage() {
		return 0.0;
	}
}

class ScienceStudent extends Student{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	
	ScienceStudent(String name,int rollNumber,int physicsMarks,int chemistryMarks,int mathMarks){
		super(name,rollNumber);
		this.physicsMarks=physicsMarks;
		this.chemistryMarks=chemistryMarks;
		this.mathMarks=mathMarks;
	}
	
	public void displayDetails()
	{
		System.out.println("Science Student Details ");
		System.out.println("physics Marks : "+physicsMarks);
		System.out.println("chemistry Marks : "+chemistryMarks);
		System.out.println("math Marks : "+mathMarks);
	}
	
	public double calculatePercentage() {
		return 0.0;
	}
}

class ArtsStudent extends Student{
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;
	
	ArtsStudent(String name,int rollNumber,int historyMarks, int geographyMarks,int englishMarks){
		super(name, rollNumber);
		this.historyMarks=historyMarks;
		this.geographyMarks=geographyMarks;
		this.englishMarks=englishMarks;
	}
	
	public void displayDetails()
	{
		System.out.println("Arts Student Details ");
		System.out.println("history Marks : "+historyMarks);
		System.out.println("geography Marks : "+geographyMarks);
		System.out.println("english Marks : "+englishMarks);
	}
	
	public double calculatePercentage() {
		return 0.0;
	}	
}



public class StudentPercentage {
	public static void main(String[] args) {
		ScienceStudent scienceStudent = new ScienceStudent("Anjali", 101, 85, 90, 80);
        ArtsStudent artsStudent = new ArtsStudent("Aryan", 102, 75, 80, 85);
	}
}
