class Bank
{
	static double balance=2000;
	public static void deposit(long accountNumber, int amount)
	{
		double totalBal=balance+amount;
		System.out.println(totalBal+" deposited Successfully.");
	}
	
    static void checkBalance()
	{
		System.out.println("Available Balance is : "+balance);
	}

}
