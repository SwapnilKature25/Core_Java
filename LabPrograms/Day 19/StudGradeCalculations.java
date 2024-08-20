class Student
{
	private String name;
	private int age;
	private char grade;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setGrade(char grade)
	{
		this.grade=grade;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	public void calculateGrade(double score1,double score2,double score3,double score4)
	{
		double totScore=(score1+score2+score3+score4)/4;
		if(totScore > 90 && totScore <= 100)
		{
			grade='A';
		}
		else if(totScore > 80 && totScore <= 89)
		{
			grade='B';
		}
		else if(totScore > 70 && totScore <= 79)
		{
			grade='C';
		}
		else if(totScore > 60 && totScore <= 69)
		{
			grade='D';
		}
		else {
			grade='F';
		}
		
	}
	public char getGrade()
	{
		return grade;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Grade : "+grade);		
	}
}


class StudGradeCalculations 
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setName("Swapnil");
		s.setAge(21);
		s.setGrade('B');
		s.calculateGrade(80,80,70,90);

		System.out.println("Name : "+s.getName());
		System.out.println("Age : "+s.getAge());
		System.out.println("Grade : "+s.getGrade());
		
		if(s.getGrade() =='A' || s.getGrade() == 'B' || s.getGrade() == 'C')
		{
			System.out.println("Student is promoted to the next class.");
		}
		else {
			System.out.println("Student stays in the same class.");
		}
	}
}
