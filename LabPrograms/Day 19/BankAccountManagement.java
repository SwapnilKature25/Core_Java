class Bank
{
	private static String bankName;
	private static String ifsc;
	private String accountHolderName;
	private long accountNumber;
	private double balance;
	
	public static void setBankName(String bankName)
	{
		this.bankName=bankName;
	}
	public static void setIfsc(String ifsc)
	{
		this.ifsc=ifsc;
	}
	
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public void setAccountNumber(long accountNumber)
	{
		if(accountNumber == 10)
		{
			this.accountNumber=accountNumber;
		}
		else {
			System.out.println("Invalid account number.");
		}
	}
	public void setBalance(double balance)
	{
		if(balance > 0)
		{
			this.balance=balance;
		}
		else {
			System.out.println("Balance can not be -ve");
		}
	}
	
	public static String getBankName()
	{
		return bankName;
	}
	public static String getIfsc()
	{
		return ifsc;
	}
	
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public long getAccountNumber()
	{
		return accountNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public static void display()
	{
		System.out.println("Bank Name : "+bankName);
		System.out.println("Bank IFSC Code : "+ifsc);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Bank Balance : "+balance);
	}
	
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance+=amount;
			System.out.println("Available Balance : "+balance);
		}
		else {
			System.out.println("Invalid amount to Deposit");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount > 0 && amount < balance)
		{
			balance-=amount;
			System.out.println("Available Balance : "+balance);
		}
		else {
			System.out.println("Invalid amount to Withdraw");
		}
	}	
	
}

class BankAccountManagement 
{
	public static void main(String[] args) 
	{
		int opt;
		double amt;
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		b.setBankName("KOTAK");
		b.setIfsc("KOTAK23045");
		b.setAccountHolderName("Swapnil");
		b.setAccountNumber(454697695l);
		b.setBalance(1000);
		
		System.out.println();
		System.out.println("Bank Name : "+b.getBankName);
		System.out.println("Bank IFSC Code : "+b.getIfsc);
		System.out.println("Account Holder Name : "+b.getAccountHolderName);
		System.out.println("Account Number  : "+b.getAccountNumber);
		System.out.println("Bank Balance : "+b.getBalance);
		System.out.println();
		System.out.println("Enter option 1. Deposit \n2. withdraw");
		opt=sc.nextInt();
		
		System.out.println("Enter amount : ");
		amt=sc.nextDouble();
		
		switch(opt){
			case 1 : 
				b.deposit(amt);
				break;
				
			case 2 :
				b.withdraw(amt);
				break;
		}
		
		b.display();
		
	}
}
