class CubeChecker
{
	public static int isCube(int num)
	{
		int t,c=0,res=0;
		for(int i=1; i<=num; i++)
		{
			t=i;
			c=t*t*t;
			if(num==c)	res=t;
		}
		return res;
	}
}


class TestCubeChecker 
{
	public static void main(String[] args) 
	{
		int number=Integer.parseInt(args[0]);
		int num=CubeChecker.isCube(number);
		if(num>0)
		{
			System.out.println("Number is a cube of "+num);
		}
		else {
			System.out.println("There is no cube of "+number);
		}
	}
}


/*
C:\Users\swapn\Programs\Java\LabPrograms\Test QA>java TestCubeChecker 8
Number is a cube of 2

C:\Users\swapn\Programs\Java\LabPrograms\Test QA>java TestCubeChecker 27
Number is a cube of 3

C:\Users\swapn\Programs\Java\LabPrograms\Test QA>java TestCubeChecker 23
There is no cube of 23

*/