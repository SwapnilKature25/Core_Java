class calculateGrossSalary 
{
	void calculateAndPrintGrossSalary(String name, int id, String address, long adharNumber, String citizenShip, double basicSalary)
	{
		if(citizenShip.equalsIgnoreCase("Indian") && countAdharDigit(adharNumber) && address.equalsIgnoreCase("hyderabad"))
		{
				calculateSalary(name,id,address,adharNumber,citizenShip,basicSalary);
		}
		else {
			System.out.println("Invalid Account");
		}
	}
	
	boolean countAdharDigit(long adharNumber)
	{
		int count=0;
		while(adharNumber!=0)
		{
			count++;
			adharNumber/=10;
		}
		if(count>=13)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	void calculateSalary(String name,int id, String address, long adharNumber, String citizenShip, double basicSalary)
	{
		double HRA,DA;
		double grossSalary;
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Address : "+address);
		System.out.println("Employee Adhar Number : "+adharNumber);
		System.out.println("Employee CitizenShip : "+citizenShip);
		System.out.println("Employee Basic Salary : "+basicSalary);
		if(basicSalary <=10000)
		{
			HRA=basicSalary* (20.0/100);
			DA=basicSalary* (80.0/100);
			System.out.println("HRA = "+HRA+" and DA : "+DA);
			grossSalary=basicSalary + HRA + DA;
		}
		else if(basicSalary <=20000)
		{
			HRA=basicSalary* (25.0/100);
			DA=basicSalary* (90.0/100);
			System.out.println("HRA = "+HRA+" and DA : "+DA);
			grossSalary=basicSalary + HRA + DA;
		}
		else {
			HRA=basicSalary* (30.0/100);
			DA=basicSalary* (95.0/100);
			System.out.println("HRA = "+HRA+" and DA : "+DA);
			grossSalary=basicSalary + HRA + DA;
		}
				 
		System.out.println("Employee Gross Salary : "+grossSalary);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	
	
	public static void main(String[] args) 
	{
		String name=args[0];
		int id=Integer.parseInt(args[1]);
		String address=args[2];
		long adharNumber=Long.parseLong(args[3]);
		String citizenShip=args[4];
		double basicSalary=Double.parseDouble(args[5]);
		calculateGrossSalary cg=new calculateGrossSalary();
		//cg.calculateAndPrintGrossSalary(args[0],Integer.parseInt(args[1]),args[2],Long.parseLong(args[3]),args[4],Double.parseDouble(args[5]));
		cg.calculateAndPrintGrossSalary(name,id,address,adharNumber,citizenShip,basicSalary);
		
	}
}


/*
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
Name : Swapnil
Id : 121343
Address : hyderabad
Adhar Number : 3256710670385
CitizenShip : Indian
Basic Salary : 20000.0
HRA = 5000.0 and DA : 18000.0
Gross Salary : 43000.0
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^




C:\Users\swapn\Programs\Java\LabPrograms\Day 10>javac calculateGrossSalary.java

C:\Users\swapn\Programs\Java\LabPrograms\Day 10>java calculateGrossSalary Swapnil 121343 Hyderabad 3256710670385 indian 40000
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
Employee Name : Swapnil
Employee Id : 121343
Employee Address : Hyderabad
Employee Adhar Number : 3256710670385
Employee CitizenShip : indian
Employee Basic Salary : 40000.0
HRA = 12000.0 and DA : 38000.0
Employee Gross Salary : 90000.0
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^



*/