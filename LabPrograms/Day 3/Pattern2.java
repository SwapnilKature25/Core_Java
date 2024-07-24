/*
1 
1 2
1 2 3
1 2 3 5
1 2 3 5 8

 */

public class Pattern2 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            for(int j=1,a=0,b=1,c; j<=i; j++)
            {
                c=a+b;
                System.out.print(c + " ");
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
