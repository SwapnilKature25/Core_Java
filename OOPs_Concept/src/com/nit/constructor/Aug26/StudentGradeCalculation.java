package com.nit.constructor.Aug26;

class Student{
	private String name;
	private int id;
	private String course;
	private double fee;
	private char grade;
	private double average;
	
	public Student(String name,int id,String course,double fee,double average)
	{
		this.name=name;
		this.id=id;
		this.course=course;
		this.fee=fee;		
		this.average=average;
	}
	
	public Student(Student s2)
	{
		this.name=s2.name;
		this.id=s2.id;
		this.course=s2.course;
		this.fee=s2.fee;
		this.average=s2.average;
	}
	
	public char calculateGrade()
	{
		if(average < 0)		System.out.println("Error: Average mark must be between 0 and 100");
		if(average >= 90)	grade='A';
		else if(average >= 80)	grade='B';
		else if(average >= 70)	grade='C';
		else if(average >= 60)	grade='D';
		else grade='F';
		
		return grade;
	}
}

public class StudentGradeCalculation {

	public static void main(String[] args) {
		Student s1=new Student("Swap",1212,"Java Full Stack",27000,-8);
		System.out.println("Grade for Average : "+s1.calculateGrade());
		Student s2=new Student(s1);
		System.out.println("Grade for Average : "+s2.calculateGrade());
		
		

	}

}
