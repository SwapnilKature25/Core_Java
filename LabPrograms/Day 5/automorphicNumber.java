/*
Program 1-An automorphic number is a number whose square ends in the 
same digits as the number itself.
For example :
5,6,25 are automorphic numbers.

5*5=25 // last digit is 5
6*6=36 // last digit is 6
25*25=625 // last digit is 25

OUTPUT :
 Enter a number: 25
 Square of 25 is 625
 25 is an Automorphic number
 
 Enter a number: 14
 Square of 14 is 196
 14 is NOT an Automorphic number

 */

 import java.util.*;
public class automorphicNumber {
    public static void main(String[] args) {
        int n,r=0;
        System.out.println("Enter a Number : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int m=n;
        int sq=n*n;
        System.out.println("Square of "+m+" is "+sq);
        while(sq!=0)
        {
            if(sq<=99){
                r=sq%10;
                break;
            }
            r=sq%100;
            sq=sq/100;
        }

        if(m==r){
            System.out.println(m+" is an Automorphic number");
        }
        else {
            System.out.println(m+" is not an Automorphic number");
        }
    }
}
