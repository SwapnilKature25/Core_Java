package com.nit.constructor.Aug26;

class Customer{
	private String customerName;
	private int creditPoints;
	
	Customer(String customerName,int creditPoints)
	{
		this.customerName=customerName;
		this.creditPoints=creditPoints;
	}
	
	public int getCreditPoints() {
		return creditPoints;
	}
	
	public String display()
	{
		return customerName;
	}
}

class CardType{
	private Customer customer;
	private String cardType;
	
	CardType(Customer customer, String cardType)
	{
		this.customer=customer;
		this.cardType=cardType;
	}
	public String getCardType() {
		return cardType;
	}
	
	public String display()
	{
		return "The Customer '"+customer+" is Eligible for '"+cardType;
	}
}

class CardsOnOffer{
	public static CardType getOfferedCard(Customer c)
	{
		CardType ct;
		if(c.getCreditPoints() > 100 && c.getCreditPoints() < 500)
		{
//			ct.getCardType()="Silver";
		}
		
		
	}
}

public class ApplicableCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
