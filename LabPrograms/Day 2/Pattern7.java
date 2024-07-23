/*
Q7. Write the program in Java to display the following pattern:
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/
class Pattern7 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1,a=5; j<=i; j++,a--)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}

/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/