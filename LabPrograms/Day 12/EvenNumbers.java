/*
5
-----------
Define a method which accepts 2 values as number and returns the even numbers between the 2 values.
Write the method with the following specifications
Name of method getEvenNumbers() // which accepts 2 integer values as arguments and return the even numbers between the range.
Arguments: Two arguments of type integer
Return Type: String value
Note: If the first argument value is greater than second value, generate even numbers from first value to second value. If the second value is less than first value, generate even numbers from second value to first.
Specifications: The value returned by the method getEvenNumbers() is determined by the following rules
Values must not be negative. If yes, then return -1 as string.
Value must not be 0 or same. If yes, then return -2 as string.
The values must be returned as a single string where each value is separated by a single blank space.
For Example:
Input: 10 20
Output: 10 12 14 16 18 20
Input: 20 10
Output: 10 12 14 16 18 20
*/
class  EvenNumbers
{
	static String getEvenNumbers(int num1,int num2)
	{
		String even=" ";
		if(num1<0 || num2<0){
			return "-1";
		}
		else if(num1==0 || num2==0 || num1==num2)
		{
			return "-2";
		}
		else 
		{
			for(int i=num1; i<=num2; i++)
			{
				if(i%2==0)
				{
					even+=i+" ";
				}
			}
		}
		return even;
	}
	public static void main(String[] args) 
	{
	    int num1=40,num2=20;
	    if(num1>num2)
		{
			  int temp=num1;
			  num1=num2;
			  num2=temp;
		}
		System.out.println(getEvenNumbers(num1,num2));
	}
}


// 20 22 24 26 28 30 32 34 36 38 40