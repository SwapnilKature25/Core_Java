/*
Q16. Write a program in Java to display the following pattern:
1
2 3
3 4 5
4 5 6 7
5 6 7 8 9
*/
class  Pattern16
{
	public static void main(String[] args) 
	{
		int b;
		for(int i=1; i<=5; i++)
		{
			b=i;
			for(int j=1; j<=i; j++,b++)
			{
				System.out.print(b+"  ");
			}
			System.out.println();
		}
	}
}
