class Customer
{
	private String customerName;
	private double monthlySpending; 

	public void setCustomerName(String name)
	{
		this.customerName=customerName;
	}
	public void setMonthlySpending(double spending)
	{
		this.monthlySpending=monthlySpending;
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	public double getMonthlySpending()
	{
		return monthlySpending;
	}
	
	public void displayDetails()
	{
		System.out.println("Customer Name : "+customerName);
		System.out.println("Monthly Spending : "+monthlySpending);
	}
	
}

class CardType
{
	private String cardName;
	
	public void setCardName(String cardName)
	{
		return cardName;
	}
	public String getCardName()
	{
		return cardName;
	}
	public static String getCardTypes(Customer customer)
	{
		CardType ct=new CardType();
		return ct;
	}
}

class CustomerTester 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
