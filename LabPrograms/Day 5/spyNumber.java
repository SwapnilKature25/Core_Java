/*
program-2 

A spy number is a number where the sum of its digits equals 
the product of its digits.
For example :
1124 is a spy number, because the sum of its digits is 1+1+2+
4=8 and the product of its digits is 1*1*2*4=8 is equal.

OUTPUT :
 
Enter the number:2114
Given number is a Spy number.
 
Enter the number:1113
Given number is NOT a Spy number.

*/

import java.util.Scanner;

public class spyNumber{
    public static void main(String[] args) {
        int n,s=0,r,pr=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        n=sc.nextInt();

        while(n!=0)
        {
            r=n%10;
            s+=r;
            pr*=r;
            n=n/10;
        }

        if(s==pr){
            System.out.println("Given number is a Spy Number");
        }
        else{
            System.out.println("Given number is not Spy Number ");
        }


    }
}

/*
Enter a Number : 
1113
Given number is not Spy Number 


Enter a Number : 
2114
Given number is a Spy Number
 */