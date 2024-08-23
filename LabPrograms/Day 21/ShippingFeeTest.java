import java.util.*;
class Package
{
	private double packageWeight;
	private int shippingDistance;
	
	public void setPackageWeight(double weight)
	{
		packageWeight=weight;
	}
	public void setShippingDistance(int distance)
	{
		shippingDistance=distance;
	}
	
	public double getPackageWeight()
	{
		return packageWeight;
	}
	public int getShippingDistance()
	{
		return shippingDistance;
	}
	
	public void displayPackageDetails()
	{
		System.out.println("Package Weight : "+packageWeight+"kg");
		System.out.println("Shipping Distance : "+shippingDistance+"km");
	}
}

class ShippingFee
{
	private double feeAmount;
	
	public double getFeeAmount()
	{
		return feeAmount;
	}
	
	public static ShippingFee calculateFee(Package pkg)
	{
		ShippingFee sf=new ShippingFee();
		if(pkg.getPackageWeight() <= 5)
		{
			if(pkg.getShippingDistance() <=100)		sf.feeAmount=5;
			else sf.feeAmount=10;
		}
		else if(pkg.getPackageWeight() > 5 && pkg.getPackageWeight() <= 20)
		{
			if(pkg.getShippingDistance() <=100)		sf.feeAmount=10;
			else sf.feeAmount=20;
		}
		else {
			if(pkg.getShippingDistance() <=100)		sf.feeAmount=20;
			else sf.feeAmount=40;
		}
		return sf;
	}
}

class  ShippingFeeTest
{
	public static void main(String[] args) 
	{
		double pw;
		int sd;
		Package p=new Package();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Package Weight  : ");
		pw=sc.nextDouble();
		System.out.print("Enter Shipping Distance  : ");
		sd=sc.nextInt();
		
		p.setPackageWeight(pw);
		p.setShippingDistance(sd);
		p.displayPackageDetails();
		
		ShippingFee sf=ShippingFee.calculateFee(p);
		System.out.println("Shipping Fee : "+sf.getFeeAmount());
	}
}


/*
Enter Package Weight  : 4
Enter Shipping Distance  : 120
Package Weight : 4.0kg
Shipping Distance : 120km
Shipping Fee : 10.0
*/