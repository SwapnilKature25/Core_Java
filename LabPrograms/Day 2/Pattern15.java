/*
Q15. Write a program in Java to display the following pattern:
1
11
101
1001
*/
class Pattern15 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(j==1 || (i==j)){
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}