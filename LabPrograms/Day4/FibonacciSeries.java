/*
 3. Write a java program to print Fibonacci Series.
input :- 5
output :-  0, 1, 1, 2, 3.

 */
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        int n,i,j,a=0,b=1,c=0;
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (i = 1; i <= n; i++) {
           System.out.print(a);
           if(i<n)
           {
               System.out.print(", ");
           }
           c=a+b;
           a=b;
           b=c;
        }
    }
}

/*
Enter a number 
5
0, 1, 1, 2, 3
 */