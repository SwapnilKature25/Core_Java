import java.util.*;
class Employee
{
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	
	public void setEmployeeData(String firstName,String lastName,int employeeId, double salary,int noOfProject)
	{
		// if instance variable and local variable are of same name then we have to use instance variable using "this" keyword.
		this.firstName=firstName;
		this.lastName=lastName;
		this.employeeId=employeeId;
		this.salary=salary;
		this.noOfProject=noOfProject;
	}
	
	public void calculateSalary()
	{
		if(noOfProject >=5 && noOfProject < 10)
		{
			salary+=5000;
		}
		else if(noOfProject >=10 && noOfProject < 20)
		{
			salary+=10000;
		}
		else {
			salary+=15000;
		}
	}
	
	public void displayDetails()
	{
		System.out.println("Employee First Name : "+firstName);
		System.out.println("Employee Last Name : "+lastName);
		System.out.println("Employee ID : "+employeeId);
		System.out.println("Employee Salary : "+salary);
		System.out.println("No Of Project : "+noOfProject);
	}
}


class CompanyEmployee
{
	public static void main(String[] args) 
	{
		String fn;
		 String ln;
		 int id;
		 double sal;
		 int nop;
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter First Name : ");
		 fn=sc.next();
		 System.out.println("Enter Last Name : ");
		 ln=sc.next();
		 System.out.println("Enter Eployee ID : ");
		 id=sc.nextInt();
		 System.out.println("Enter Salary : ");
		 sal=sc.nextDouble();
		 System.out.println("Enter No of Projects : ");
		 nop=sc.nextInt();		 
		 
		Employee e=new Employee();
		e.setEmployeeData(fn,ln,id,sal,nop);
		e.calculateSalary();
		e.displayDetails();
	}
}
