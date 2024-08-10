/*
1
-----------
Write a Java program to check whether a number is a Harshad Number or not.
In recreational mathematics, a harshad number in a given number base, is an integer that is divisible by the sum of its digits when written in that base.
Example: Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0) and 200 is divisible by 2. Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) and 171 is divisible by 9.
Create a Class HarsadNumber (BLC)
methods:

Method name: getSum()
Parameter: int
Modifiers: public, static
return type: int
Logic: This methods returns the sum of each digit.

Method name: checkHarsad()
Parameter: int
Modifiers: public, static
return type: void
Logic: This checks and prints the number is harsad number or not a harsad number.

Create a ELC class named TestHarsadNumber, take main method and test the code by taking the input from user.
Expected Output

Input a number : 353

353 is not a Harshad Number.
*/

class  HarsadNumber 
{
	static int n;
	public static int getSum(int num)
	{
		int sum=0,r;
		n=num;
		while(num!=0)
		{
			r=num%10;
			sum+=r;
			num=num/10;
		}
		return sum;		
	}
	public static void checkHarshad(int sum)
	{
		
		if(n%sum == 0)
		{
			System.out.println(n+" is a Harshad Number");
		}
		else {
			System.out.println(n+" is not a Harshad Number");
		}
	}
	
}

class TestHarshadNumber
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int sum=HarsadNumber.getSum(num);
		HarsadNumber.checkHarshad(sum);
	}
}



/*
C:\Users\swapn\Programs\Java\LabPrograms\Day 14>java TestHarshadNumber 200
200 is a Harshad Number

C:\Users\swapn\Programs\Java\LabPrograms\Day 14>javac TestHarshadNumber.java

C:\Users\swapn\Programs\Java\LabPrograms\Day 14>java TestHarshadNumber 353
353 is not a Harshad Number

C:\Users\swapn\Programs\Java\LabPrograms\Day 14>java TestHarshadNumber 171
171 is a Harshad Number

*/