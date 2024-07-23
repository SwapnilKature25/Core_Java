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
			for(int j=1; j<=i; j++)
			{
				if((a*2)%2==0){
					System.out.print(a+" ");
				}
			}
			System.out.println();
			a-=2;
		}
	}
}

Pattern13
Q13. Write the program in Java to display the following pattern:
9
9 7
9 7 5
9 7 5 3
9 7 5 3 1
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
9
9 7
9 7 5
9 7 5 3
9 7 5 3 1
Pattern14
Q14. Write a program in Java to display the following pattern:
1
2   3
4   5   6
7   8   9   10
11 12 13 14 15
for(int i=1; i<=5; i++)
		{
			for(int j=1,a=9; j<=i; j++,a-=2)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
Q15. Write a program in Java to display the following pattern:
1
11
101
1001
Pattern15
for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++,a++)
			{
				System.out.print(a+"  ");
			}
			System.out.println();
		}
System.out.print("1");