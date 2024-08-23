class Employee
{
	private String employeeName;
	private double basicSalary;
	private int performanceRating;
	
	public void setEmployeeName(String name)
	{
		employeeName=name;
	}
	public void setBasicSalary(double salary)
	{
		basicSalary=salary;
	}
	public void setPerformanceRating(int rating)
	{
		performanceRating=rating;
	}
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	public double getBasicSalary()
	{
		return basicSalary;
	}
	public int getPerformanceRating()
	{
		return performanceRating;
	}
	
	public void displayDetails()
	{
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+basicSalary);
		System.out.println("Employee Performance Rating : "+performanceRating);
	}
	
}

class Bonus
{
	private double bonusAmount;
	
	public double getBonusAmount()
	{
		return bonusAmount;
	}
	
	public static Bonus calculateBonus(Employee emp)
	{
		Bonus b=new Bonus();
		if(emp.getPerformanceRating() == 1)
		{ 
			b.bonusAmount=5 ;
		}
		else if(emp.getPerformanceRating() == 2)
		{ 
			b.bonusAmount=10;
		}
		else if(emp.getPerformanceRating() == 3)
		{ 
			b.bonusAmount=15;
		}
		else if(emp.getPerformanceRating() == 4)
		{ 
			b.bonusAmount=20 ;
		}
		else if(emp.getPerformanceRating() == 5)
		{ 
			b.bonusAmount=25;
		}
		return b;
	}
}


class  EmployeeBonusTest
{
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setEmployeeName("Swap");
		e.setBasicSalary(67000);
		e.setPerformanceRating(5);
		e.displayDetails();
		
		Bonus b=Bonus.calculateBonus(e);
		System.out.println("Bonus Amount : "+b.getBonusAmount()+"% of basic salary");
	}
}


/*
Employee Name : Swap
Employee Salary : 67000.0
Employee Performance Rating : 5
Bonus Amount : 25.0% of basic salary
*/