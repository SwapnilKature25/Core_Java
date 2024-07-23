/*
Q18. Write a program in Java to display the following pattern:
    1
   21
  321
 4321
54321
*/

class Pattern18 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=4; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1,b=i; j<=i; j++,b--)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}

/*
    1
   2 1
  3 2 1
 4 3 2 1
5 4 3 2 1
*/