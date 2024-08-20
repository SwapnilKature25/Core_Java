import java.util.*;

class Employee
{
	private String name;
	private String department;
	private double salary;
	private boolean active;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDepartment(String department)
	{
		this.department=department;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void setActive(boolean active)
	{
		this.active=active;
	}
	
	public String getName()
	{
		return name;
	}
	public String getDepartment()
	{
		return department;
	}
	public double getSalary()
	{
		return salary;
	}
	public boolean getActive()
	{
		return active;
	}	
	
	public void displayDetails()
	{
		System.out.println("Employee Name : "+name);
		System.out.println("Department : "+department);
		System.out.println("Salary : "+salary);
		System.out.println("Active or not : "+active);
		System.out.println();
	}
}

class  EmployeeDetails
{
	public static void main(String[] args) 
	{
		String name,department;
		double salary;
		boolean active;
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee Name : ");
		name=sc.nextLine();
		System.out.print("Enter Employee Department : ");
		department=sc.nextLine();
		System.out.print("Enter Employee Salary : ");
		salary=sc.nextDouble();
		System.out.print("Enter Employee Active or Not : ");
		active=sc.nextBoolean();
		
		e.setName(name);
		e.setDepartment(department);
		e.setSalary(salary);
		e.setActive(active);
		
		System.out.println("Employee Name : "+e.getName());
		System.out.println("Department : "+e.getDepartment());
		System.out.println("Salary : "+e.getSalary());
		System.out.println("Active or not : "+e.getActive());
		System.out.println();
		
		if(e.getActive() &&  (e.getSalary() > 50000) )
		{
			salary =salary + salary*10/100;
			e.setSalary(salary);
			System.out.println("You are Eligible for Bonus");
			e.displayDetails();
		}
	}
}


/*
Enter Employee Name :
Swap
Enter Employee Department :
Swefwe
Enter Employee Salary :
100000
Enter Employee Active or Not :
true

Employee Name : Swap
Department : Swefwe
Salary : 100000.0
Active or not : true

You are Eligible for Bonus
Employee Name : Swap
Department : Swefwe
Salary : 110000.0
Active or not : true

*/