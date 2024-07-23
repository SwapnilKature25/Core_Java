/*
Q14. Write a program in Java to display the following pattern:
1
2   3
4   5   6
7   8   9   10
11 12 13 14 15
*/

class Pattern14 
{
	public static void main(String[] args) 
	{
		int a=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++,a++)
			{
				System.out.print(a+"  ");
			}
			System.out.println();
		}
	}
}
