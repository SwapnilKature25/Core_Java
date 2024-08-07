/*
4
------------
Write a Java program to check whether a number is a Pronic or Heteromecic Number or not.
A pronic number is a number which is the product of two consecutive integers, that is, a number of the form n(n + 1).
The first few pronic numbers are:
0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462 … etc.
Expected Output
Input a number : 110
Pronic Number.

Create a method:
method name: isPronicNumber()
parameters: int num
modifiers: static, public
return type :boolean
Logic: This method returns Boolean result based on the number is pronic or not.

Expected Output
Input a number : 110
Pronic Number: true

*/

class  PronicNumber
{
	public static boolean isPronicNumber(int num)
	{
	    
		for(int i=2; i<=num/2; i++)
		{
		    if(num%i==0 && num%(i+1)==0)
		    {
		        int pr=i*(i+1);
		        if(pr==num)
		        {
		            return true;
		        }
		    }
		}
		return false;
	}
	public static void main(String[] args) 
	{
		if(isPronicNumber(20))
		{
			System.out.println("Pronic Number");
		}
		else {
			System.out.println("Heteromecic Number");
		}
	}
}
