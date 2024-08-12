
class Finding
{
	static void prime(int num)
	{
		int c=1;
		for(int i=2; i<=num; i++)
		{
			if(num%i==0)	c++;
		}
		if(c==2)	System.out.println(num+" is a Prime Number");
		else System.out.println(num+" is not a Prime Number");
	}
}



class Test 
{
	public static void main(String[] args) 
	{
		Finding.prime(Integer.parseInt(args[0]));
	}
}


/*
C:\Users\swapn\Programs\Java\LabPrograms\Test QA>java Test 6
6 is not a Prime Number

C:\Users\swapn\Programs\Java\LabPrograms\Test QA>java Test 41
41 is a Prime Number

C:\Users\swapn\Programs\Java\LabPrograms\Test QA>java Test 89
89 is a Prime Number
*/