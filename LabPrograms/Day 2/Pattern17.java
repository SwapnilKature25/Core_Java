/*
Q17. Write a program in Java to display the following pattern:
    1
   12
  123
 1234
12345
*/
class Pattern17 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=4; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1,b=1; j<=i; j++,b++)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}

/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
*/