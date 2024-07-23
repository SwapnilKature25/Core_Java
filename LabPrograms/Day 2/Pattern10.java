/*
Q10. Write a program in Java to display the following pattern:
3
44
555
6666
77777
*/
class Pattern10
{
	public static void main(String[] args) 
	{
		int a=3;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(a);
			}
			System.out.println();
			a++;
		}
	}
}

/*
3
44
555
6666
77777
*/