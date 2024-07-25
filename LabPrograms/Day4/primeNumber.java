/*
 1. Write a Java program to find prime  number upto given number   by using for loop?
input : n = 10.
output :- 2,3,5,7.

 */

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        int n,i,j;
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }
}

/*
Enter a number 
10
2 3 5 7
 */
