/*
Q12. Write the program in Java to display the following pattern:
9
7 9
5 7 9
3 5 7 9
1 3 5 7 9
*/
class Pattern12 
{
	public static void main(String[] args) 
	{
		int a=9;
		for(int i=1; i<=5; i++)
		{
			for(int j=1,b=0; j<=i; j++,b+=2)
			{
				System.out.print((a+b)+"  ");
			}
			System.out.println();
			
			a-=2;
		}
	}
}