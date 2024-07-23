/*
Q19. Write a program in Java to display the following pattern:
   1
  31
 531
7531
*/
class Pattern19 
{
	public static void main(String[] args) 
	{
		int a=1;
		for(int i=1; i<=4; i++)
		{
			for(int k=4; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1,b=a; j<=i; j++,b-=2)
			{
				System.out.print(b+" ");
			}
			a+=2;
			System.out.println();
		}
	}
}

/*
    1
   3 1
  5 3 1
 7 5 3 1
*/