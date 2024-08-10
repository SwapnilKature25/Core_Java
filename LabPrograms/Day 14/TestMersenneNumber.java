class MersenneNumber
{
	public static void checkMersenne(int n)
	{
		int m,count=0;
		m=(2*n)-1;
		System.out.println(m);
		for(int i=m; i>1; i--)
		{
			if(m%i==0) count++;
		}
		if(count==2)	System.out.println(n+" is a Mersenne Number");
		else	System.out.println(n+" is not a Mersenne Number");
	}
}


class TestMersenneNumber 
{
	public static void main(String[] args) 
	{
		MersenneNumber.checkMersenne(Integer.parseInt(args[0]));
	}
}
