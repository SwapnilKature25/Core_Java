
/*
Ques
1
-------------
Write a method which can find the sum of the first n prime numbers. Prime numbers are numbers which have only 1 and the number itself as its factors.
2 is the only even prime number. 1 is neither prime nor composite.
Example: the 1st 5 prime numbers are 2,3,5,7,11 and sum is 28
Method Name : getPrimeSum
Method Description :Get the sum of the first n prime numbers and return its sum.
Argument : int n
Return Type : int
*/
		 

class PrimeNumberSum 
{
	static int getPrimeSum(int n){
		int c,t,flag=0,s=0;
		System.out.print("The First "+n+" prime numbers are ");
		for(int i=2; i<=(n*n)/2; i++)
		{
			t=i;
			c=1;
			for(int j=i; j>1; j--)
			{
				if(t%j==0) {
				    c++;
				}
			}
			if(c==2)	
			{
				System.out.print(t+" ");
				s+=t;
			}
		}
		return s;
	}
	public static void main(String[] args) 
	{
		int primeSum=getPrimeSum(5);
		System.out.println("and Sum is "+ primeSum);
	}
}



//The First 5 prime numbers are 2 3 5 7 11 and Sum is 28
