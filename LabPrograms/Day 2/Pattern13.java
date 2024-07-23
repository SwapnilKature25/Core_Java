/*
Q13. Write the program in Java to display the following pattern:
9
9 7
9 7 5
9 7 5 3
9 7 5 3 1
*/
class Pattern13 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1,a=9; j<=i; j++,a-=2)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
/*
9
9 7
9 7 5
9 7 5 3
9 7 5 3 1
*/