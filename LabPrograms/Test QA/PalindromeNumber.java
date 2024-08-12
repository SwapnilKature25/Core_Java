class Finding
{
	static void palindrome(int num)
	{
	int rem,rev=0,n;
	n=num;
	if(n>=-9 && n<=9)	System.out.println("It is a Palindrome");
	else {
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(num==rev)
		{
			System.out.println(num+" is a Palindrome");
		}
		else {
			System.out.println(num+" is not a Palindrome");
		}
		
		}
	}
}
class PalindromeNumber 
{	
	public static void main(String[] args) 
	{
		Finding.palindrome(Integer.parseInt(args[0]));
	}
}
