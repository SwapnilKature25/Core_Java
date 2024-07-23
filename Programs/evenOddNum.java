import java.util.*;
class evenOddNum 
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		if(num%2==0)	System.out.println("Even");
		else System.out.println("Odd");
	}
}
/*
C:\Users\swapn\Programs\Java\Programs>javac evenOddNum.java
C:\Users\swapn\Programs\Java\Programs>java evenOddNum 12
Even
*/
