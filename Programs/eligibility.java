class eligibility 
{
	public static void main(String[] args) 
	{
		int age=Integer.parseInt(args[0]);
		  if(age<1 || age>100){
				 System.out.println("enter valid age");
		  }
			if(age>=18){
				System.out.println("You are Eligible");
			}
			else {
				System.out.println("You are not Eligible");
			}
	}
}

/*
C:\Users\swapn\Programs\Java\Programs>javac eligibility.java

C:\Users\swapn\Programs\Java\Programs>java eligibility 17
You are not Eligible
*/