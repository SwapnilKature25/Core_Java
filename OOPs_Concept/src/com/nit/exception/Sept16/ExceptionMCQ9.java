package com.nit.exception.Sept16;

import java.util.Scanner;

public class ExceptionMCQ9 {
public void addLogic(int a,int b)
{
if(a<0||b<0)
{
throw new IllegalArgumentException("don’t pass the -ve number");
}
else
{
int c=a+b;
System.out.println("addition of the no:"+c);
}
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the 2 number"); 
int a=sc.nextInt();
int b=sc.nextInt();
ExceptionMCQ9 e5=new ExceptionMCQ9();
// e5.addLogic(a,b);
try
{
e5.addLogic(a, b);
}
catch(IllegalArgumentException e)
{
System.out.println(e.getMessage());
}
}
}
//}[Assume:a=0,b=5]

/*
enter the 2 number
2 -3
don�t pass the -ve number 

enter the 2 number
0 5
addition of the no:5


enter the 2 number
2 s
Exception in thread "main" java.util.InputMismatchException
*/
 