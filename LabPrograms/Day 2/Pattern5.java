/*
Q5. Write a program in Java to display the following pattern:
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/
class Pattern5 
{
	public static void main(String[] args) 
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=1,a=5; j<=i; j++,a--)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
