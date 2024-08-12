class MathNumber
{
	static int sum;
	public static boolean isNivenNumber(int num)
	{
		int n=num,rem;
		for(; n!=0; n/=10){
			rem=n%10;
			sum+=rem;
		}
		if(num%sum == 0)	return true;
		else	return false;
	}
}

class TestMathNumber 
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		boolean res=MathNumber.isNivenNumber(num);
		if(res)	System.out.println(num+" is divisible by "+MathNumber.sum+" so it is a Niven Number");
		else System.out.println(num+" is not divisible by "+MathNumber.sum+" so it is not a Niven Number");
	}
}


/*
C:\Users\swapn\Programs\Java\LabPrograms\Test QA>java TestMathNumber 200
200 is divisible by 2 so it is a Niven Number

C:\Users\swapn\Programs\Java\LabPrograms\Test QA>java TestMathNumber 204
204 is divisible by 6 so it is a Niven Number

C:\Users\swapn\Programs\Java\LabPrograms\Test QA>java TestMathNumber 203
203 is not divisible by 5 so it is not a Niven Number
*/