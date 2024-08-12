class EmpirNumber 
{
	public static void isPrime(int num)
	{
		int c,t=0,r,flag=0,nNum=0,m=0;
		for(int i=2; i<=num; i++)
		{
			c=1;
			if(num%i==0)	c++;
			if(c==2)
			{
				t=num;
			}
			while(t!=0)
				{
					nNum=0;
					r=t%10;
					nNum=nNum*10+r;
					t=t/10;
				}
				m=nNum;
				for( i=2; i<=m; i++)
				{
					c=1;
					if(m%i==0)	c++;	
					if(c==2)	flag=1;
				}
		}
		if(flag==1)	 System.out.println(num+" is a Empir number");
		else System.out.println(num+" is not a Empir number");
	}
	public static void main(String[] args) 
	{
		isPrime(79);
	}
}
