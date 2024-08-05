/*
2. Write a Java program to print multiplication table from 2 to 5 by using for loop?
input : 5.
output :-

 */

public class multiplicationTable {
    public static void main(String[] args) {
        int i,j;

        for (i = 1; i <= 10; i++) {

            for (j = 2; j <=5; j++) {
                System.out.print(j +" * "+i+" = "+ (i*j) +"\t");
            }
            System.out.println();
        }
    }
}


/*
2 * 1 = 2       3 * 1 = 3       4 * 1 = 4       5 * 1 = 5
2 * 2 = 4       3 * 2 = 6       4 * 2 = 8       5 * 2 = 10
2 * 3 = 6       3 * 3 = 9       4 * 3 = 12      5 * 3 = 15
2 * 4 = 8       3 * 4 = 12      4 * 4 = 16      5 * 4 = 20
2 * 5 = 10      3 * 5 = 15      4 * 5 = 20      5 * 5 = 25
2 * 6 = 12      3 * 6 = 18      4 * 6 = 24      5 * 6 = 30
2 * 7 = 14      3 * 7 = 21      4 * 7 = 28      5 * 7 = 35
2 * 8 = 16      3 * 8 = 24      4 * 8 = 32      5 * 8 = 40
2 * 9 = 18      3 * 9 = 27      4 * 9 = 36      5 * 9 = 45
2 * 10 = 20     3 * 10 = 30     4 * 10 = 40     5 * 10 = 50
 */