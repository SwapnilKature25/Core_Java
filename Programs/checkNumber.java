 
import java.util.*;
class checkNumber 
{
	public static void main(String[] args) 
	{
		String a=args[0];
		int num=Integer.parseInt(a);
		if(num<0)	System.out.println("Negative Number");
		else System.out.println("Positive Number");
	}
}

/*
C:\Users\swapn\Programs\Java\Programs>javac checkNumber.java

C:\Users\swapn\Programs\Java\Programs>java checkNumber -2
Negative Number
*/