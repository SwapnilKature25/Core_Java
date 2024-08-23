class User
{
	private String userName;
	private double purchaseAmount;
	private String membershipStatus;
	
	public void setUserName(String name)
	{
		this.userName=userName;
	}
	public void setPurchaseAmount(double amount)
	{
		this.purchaseAmount=purchaseAmount;
	}
	public void setMembershipStatus(String status)
	{
		this.membershipStatus=membershipStatus;
	}
	
	public String getUserName()
	{ 
		return userName;
	}
	public double getPurchaseAmount()
	{ 
		return purchaseAmount;
	}
	public String getMembershipStatus()
	{
		return membershipStatus;
	}
	
	public void displayDiscount()
	{
		System.out.println("User Name : "+userName);
		System.out.println("Purchase Amount : "+purchaseAmount);
		System.out.println("Membership Status"+membershipStatus);
	}	
	
	public void applyDiscount(Discount discount)
	{
		double final_price=purchaseAmount - discount.purchaseAmount;
		System.out.println("Final Price : "+final_price);
	}
}

class Discount
{
	private double discountPercentage;
	public 
}

class UserTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
