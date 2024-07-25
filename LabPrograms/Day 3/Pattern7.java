/*
    1  2  3  4  5
    6  7  8  9
   10 11 12
   13 14
   15

 */
public class Pattern7 {
    public static void main(String[] args) {
        int a=1;
        for(int i=1; i<=5; i++)
        {
            for(int j=i; j<=5; j++)
            {
                if(a<9){
                    System.out.print(" ");
                }
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}

/*
 1  2  3  4  5 
 6  7  8 9
10 11 12
13 14
15
 */
