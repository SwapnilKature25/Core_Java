import java.util.Scanner;
class Student
{
	private int studentId;
	private String studentName;
	private int marks;
	private char grade;
	
	
	//public void setStudentData(int studentId,String studentName,int marks)
	public void setStudentData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stud Data : ");
		studentId= sc.nextInt();
		studentName= sc.nextLine();
		marks= sc.nextInt();	
		grade=calculateGrade();
	}
	public char calculateGrade()
	{
		if(marks > 90)	grade='A';
		else if(marks > 80 && marks <= 90)	grade='B';
		else if(marks > 70 && marks <= 80)	grade='C';
		else if(marks > 60 && marks <= 70)	grade='D';
		else grade='E';
		return grade;
	}
	public void displayDetails()
	{
		System.out.println("Name = "+studentName+",  StudentId = "+studentId+",  marks = "+marks+",  grade = "+grade);
	}
}

class  Tester
{
	public static void main(String[] args) 
	{
		Student st=new Student();
		st.setStudentData();
		st.calculateGrade();
		st.displayDetails();
	}
}
