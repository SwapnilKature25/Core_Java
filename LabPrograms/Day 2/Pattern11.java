/*
Q11. Write the program in Java to display the following pattern:
9 9 9 9 9
7 7 7 7 7
5 5 5 5 5
3 3 3 3 3
1 1 1 1 1
*/

class Pattern11 
{
	public static void main(String[] args) 
	{
		int a=9;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(a+" ");
			}
			System.out.println();
			a-=2;
		}
	}
}
