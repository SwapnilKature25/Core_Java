import java.util.Scanner;

class Mobile 
{
	String contact;
	long number;
	
	public void saveContact(String contact,long number)
	{
		this.contact=contact;
		this.number=number;
	}
	
	public void call(String contact)
	{
		int d=0, c=0;	`	
		Integer t=Integer.parseInt(contact);
		int temp=t;
		
		do{
			d=temp%10;
			c++;
			temp/=10;
		}
		while(temp!=0);
		
		if(c==10){
			System.out.println("Calling "+contact);
		}
		else {
			System.out.println("Invalid mobile number");
		}
	}
	
	
	public void call(long number){
		System.out.println("Calling "+number);
	}
	
	public void splitScreen(){
		System.out.println("Displaying background notifications");
		
	}
	
}

class User 
{
	public static void main(String[] args) 
	{
		Mobile iphone=new Mobile();
		long number=123456789l;
		String contactName="Bangaram";
		iphone.saveContact(contactName,number);
		
		iphone.call(number);
		iphone.call(7689008754l);
		iphone.splitScreen();
	}
}
