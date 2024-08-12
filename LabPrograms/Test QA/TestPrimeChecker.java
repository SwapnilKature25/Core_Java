class PrimeChecker
{
	public static String getPrime(int num)
	{
		String res=" ";
		for(int i=1; i<=num*2+1; i++)
		{
			int c=1,t;
			t=i;
			for(int j=2; j<=num; j++)
			{
				if(num%j==0)	c++;
			}
			if(c==2)  res+=t;
		}
		System.out.println(res);
		return res;
	}
}


class  TestPrimeChecker
{
	public static void main(String[] args) 
	{
		System.out.println(PrimeChecker.getPrime(6));
	}
}
