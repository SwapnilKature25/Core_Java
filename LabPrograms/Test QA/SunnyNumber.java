class SunnyNumber 
{
	static void findSunnyNumber(int num)
	{
		num=num+1;
		
		int sq=0,t=0,res=0;
		for(int i=1; i<num/2; i++)
		{
			sq=0;
			t=i;
			sq=t*t;
			if(num==sq)	  res=t;
		}
		if(res>0)	System.out.println(res+" is a Sunny Number");
		else System.out.println("Not a Sunny Number");
		
	}
	public static void main(String[] args) 
	{
		findSunnyNumber(Integer.parseInt(args[0]));
	}
}


//5 is a Sunny Number