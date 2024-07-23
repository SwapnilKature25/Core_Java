/*
Q20.Write a program in Java to display the following pattern:
1
3 1
5 3 1
7 5 3 1
9 7 5 3 1
*/
class Pattern20 
{
	public static void main(String[] args) 
	{
		int a=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1,b=a; j<=i; j++,b-=2)
			{
				System.out.print(b+"  ");
			}
			System.out.println();
			
			a+=2;
		}
	}
}

/*
1
3  1
5  3  1
7  5  3  1
9  7  5  3  1
*/