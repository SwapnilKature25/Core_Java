package com.nit.exception.Sept16;

public class exceptionSnippet {
	static int num;
	int ab;
	
	
	static void call() {
		
	}
	

	public static void main(String[] args) {
		/*
		char ch;
		int x = 97;
		do
		{
		ch = (char) x;
		System.out.println (ch + " ");
		if(x% 10== 0)
		break;
		++x;
		}
		while (x <= 100); */
		/*
		a 
		b 
		c 
		d  
		*/
		
		/*
		String s = "2024";
		 int x=Integer.valueOf(s);
		 Double y = Double.valueOf(s);
		 System.out.println("x="+x);
		 System.out.println("y="+y);
		 */
		 /* x=2024
			y=2024.0
		 */

		 /*
		 String s = "20.24";
		 int x=Integer.valueOf(s);
		 Double y = Double.valueOf(s);
		 System.out.println("x="+x);
		 System.out.println("y="+y); */
		 
		 // Exception in thread "main" java.lang.NumberFormatException: For input string: "20.24"
		 
		 /*
		 String s = "A2024";
		 int x=Integer.valueOf(s);
		 Double y = Double.valueOf(s);
		 System.out.println("x="+x);
		 System.out.println("y="+y);
		 */
		 //Exception in thread "main" java.lang.NumberFormatException: For input string: "A2024"
		
		
			char cha = '*';
		   boolean b = Character.isLetter(cha);
		   System.out.println(b);
		   
		// false

		
		   
		   String s= "1";
		   int t =Integer.parseInt(s);
		   t = t + 1000;
		   System.out.println(t);	//1001

		   
		   
//		   char c = 'A';
//		   int i = 5;
//		   System.out.println(c + i);	//70
//		   System.out.println((int)c + i);	//70
		   
		   
		   
		   char ch = 'j';
		   char chr = Character.toUpperCase(ch);
		   int p = (int) chr;
		   System.out.println(chr + "\t" + p);		// J	74
		   
		   
		   
//		   int n = 97;
//		   char cht = Character.toUpperCase((char)n);
//		   System.out.println(cht + " India is a democratic Country");		//A India is a democratic Country

		   
		   char chc = 'x'; int n = 7;
		   n = n + (int)chc;
		   char c = (char)n;
		   System.out.println(c);
		   
		   
	}

}
