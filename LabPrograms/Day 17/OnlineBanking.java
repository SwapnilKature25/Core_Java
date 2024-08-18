import java.util.*;
class BankAccount
{
	private String bankName;
	private String bankCustomerName;
	private String bankAddress;
	private String bankIFSCCode;
	private long customerAccountNumber;
	private double currentBalance=1000;
	
	
	public void setDetails(String bankName, String bankCustomerName, String bankAddress, String bankIFSCCOde,long customerAccountNumber)
	{
		this.bankName=bankName;
		this.bankCustomerName=bankCustomerName;
		this.bankAddress=bankAddress;
		this.bankIFSCCode=bankIFSCCode;
		this.customerAccountNumber=customerAccountNumber;
	}
	
	public void withdraw(double amount)
	{
		if(amount > 0)
		{
			if(amount < currentBalance)
			{
				double tempAmount=currentBalance - amount;
				if(tempAmount <= 1000)
				{
					System.out.println("Maintain Minimum Balance of Rs.1000");		
				}
				else  {
					currentBalance-=amount;
					System.out.println("You've successfully Withdrawn \n");		
					CurrentBalance();
				}
			}
			else 
			{
				System.out.println("Insufficient Balance");
			}
		}
		else {
			System.out.println("Enter valid amount");
		}
	}
	
	public void deposit(double amount)
	{
		if(currentBalance >=1000)
		{
			currentBalance+=amount;
			System.out.println("You've successfully Deposited \n");		
			CurrentBalance();
		}
	}
	
	public void CurrentBalance()
	{
		System.out.println("Available Balance : "+currentBalance);
	}
	
	
	public String displayDetails()
	{
		return "BankAccount [Bank Name :"+bankName+" Customer Name : "+bankCustomerName+" Address : "+bankAddress+" Account Number : "+customerAccountNumber+" Balance : "+currentBalance+" ]";
	}
	
}

class  OnlineBanking
{
	public static void main(String[] args) 
	{
		long can;
		int opt;
		boolean exit=false;
		String bn,bcn,ba,bifsc;
		double cb,amt;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Bank Name : ");
		bn=sc.nextLine();		
		System.out.print("Enter Bank Customer Name : ");
		bcn=sc.nextLine();		
		System.out.print("Enter Bank Address : ");
		ba=sc.nextLine();		
		System.out.print("Enter Bank IFSC Code : ");
		bifsc=sc.nextLine();
		System.out.print("Enter Customer Account Number : ");
		can=sc.nextLong();
		
		
		BankAccount b=new BankAccount();
		b.setDetails(bn,bcn,ba,bifsc,can);
		
		while(!exit)
		{
			System.out.println("\nWelcome to the Bank Operations : \nEnter 1 for balance enquiry \nEnter 2 for withdraw amount \nEnter 3 for deposit \nEnter 4 for display customer details\nEnter 5 for Exit");
			opt=sc.nextInt();
			switch(opt)
			{
				
			case 1:
				b.CurrentBalance();
				break;			
			
			case 2:
				System.out.println("Enter the amount to withdraw :  ");
				amt=sc.nextDouble();
				b.withdraw(amt);
				break;
				
			case 3:
				System.out.println("Enter the amount to deposit : ");
				amt=sc.nextDouble();
				b.deposit(amt);
				break;
				
			case 4:
				String res=b.displayDetails();
				System.out.println(res);
				break;
			
			case 5:
				exit = true;
                System.out.println("Thank you for using our services.");
				break;
				
			 default:
				System.out.println("Enter from above Operatins");
			}
		}
		
		
	}
}
