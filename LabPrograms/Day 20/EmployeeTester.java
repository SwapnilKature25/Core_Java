import java.util.*;
class Employee
{
	private String employeeName;
	private String department;
	private double baseSalary;
	private int performanceScore;
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName=employeeName;
	}
	public void setDepartment(String department)
	{
		this.department=department;
	}
	public void setBaseSalary(double baseSalary)
	{
		this.baseSalary=baseSalary;
	}
	public void setPerformanceScore(int performanceScore)
	{
		this.performanceScore=performanceScore;
	}
	
	public double calculateBonus()
	{
		double bonus;
		if(performanceScore > 8 && performanceScore < 10)
		{
			bonus=baseSalary*20/100;
		}
		else if(performanceScore >= 5 && performanceScore <= 7)
		{
			bonus=baseSalary*10/100;
		}
		else {
			bonus=baseSalary*0;;
		}
		return bonus;
	}
	
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	public String getDepartment()
	{
		return department;
	}
	public double getBaseSalary()
	{
		return baseSalary;
	}
	public int getPerformanceScore()
	{
		return performanceScore;
	}
		
}

class  EmployeeTester
{
	public static void main(String[] args) 
	{
		String dep,empName;
		double bsal;
		int perScore;
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee Name : ");
		empName=sc.nextLine();
		System.out.print("Enter Department : ");
		dep=sc.nextLine();
		System.out.print("Enter Employee Base Salary : ");
		bsal=sc.nextDouble();
		System.out.print("Enter Performance Score in b/w 1 to 10 : ");
		perScore=sc.nextInt();
		
		e.setEmployeeName(empName);
		e.setDepartment(dep);
		e.setBaseSalary(bsal);
		e.setPerformanceScore(perScore);
		
		double bonus=e.calculateBonus();
		System.out.println("Employee Name : "+ e.getEmployeeName());
		System.out.println("Department : "+e.getDepartment());
		System.out.println("Employee Base Salary : "+e.getBaseSalary());
		System.out.println("Bonus on Base Salary : "+bonus);
		System.out.println("Performance Score is : " + e.getPerformanceScore());
	}
}


/*
Enter Employee Name : Swapnil Kature
Enter Department : S/W Developer
Enter Employee Base Salary : 50000
Enter Performance Score in b/w 1 to 10 : 9
Employee Name : Swapnil Kature
Department : S/W Developer
Employee Base Salary : 50000.0
Bonus on Base Salary : 10000.0
Performance Score is : 9
*/