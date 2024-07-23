class LargestNumber 
{
	public static void main(String[] args) 
	{
		/*  1st way
		String a=args[0];
		String b=args[1];
		
		int num1=Integer.parseInt(a);
		int num2=Integer.parseInt(b);
		if(num1==num2)	System.out.println("both are same");  */
		
		// 2nd way
		int num1= Integer.parseInt(args[0]);
		int num2= Integer.parseInt(args[1]);
		if(num1==num2)	System.out.println("both are same");
		else if(num1>num2) System.out.println(num1+" Number is big");
		else System.out.println(num2+" Number is big");
	}
}


/*
C:\Users\swapn\Programs\Java\Programs>javac LargestNumber.java
C:\Users\swapn\Programs\Java\Programs>java LargestNumber 8 6
8 Number is big



*/
