/*
Q6. Write the program in Java to display the following pattern:
1 3 5 7 9
1 3 5 7
1 3 5
1 3
1
*/
class Pattern6 
{
	public static void main(String[] args) 
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=1,a=1; j<=i*2; j++,a++)
			{
				if(a%2!=0){
					System.out.print(a+" ");
				}
			}
			System.out.println();
		}
	}
}

/*
1 3 5 7 9
1 3 5 7
1 3 5
1 3
1
*/