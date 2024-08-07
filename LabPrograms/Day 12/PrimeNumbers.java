/*
3
-----------
Define a method which accepts 2 values as number and returns the prime numbers between the values.
Write the method with the following specifications:
Name of method: getPrimeNumbers()
Arguments: two arguments of type integers
Return Type: String

Specifications: The value returned by the method getPrimeNumbers() is determined by the following rules:
Value must not be negative. If yes, then return -1 as string.
1st value must not be greater than or equal to 2nd value. If yes, then return -2 as string.
Prime Numbers must be returned as one string with every value separated by single blank space.
*/

class PrimeNumbers 
{
	static String getPrimeNumbers(int strt,int last)
	{
		String res=" ";
		int t=0;
		if(strt < 0 || last < 0){
			return "-1";
		}
		else if(strt>last){
			return "-2";
		}
		else {
			for(int i=strt; i<=last; i++)
			{
				t=i;
				int c=1;
				for(int j=t; j>1; j--)
				{
					if(i%j==0)
					{
						c++;
					}
				}
				if(c==2)	res+=i +" ";
			}		
		}
		
		return res;
		
	}
	public static void main(String[] args) 
	{
		String res=getPrimeNumbers(2,12);
		System.out.println(res);
	}
}


// 2 3 5 7 11