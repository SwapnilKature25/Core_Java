/*
          1 
       3  2  1
    5  4  3  2  1
 7  6  5  4  3  2   1

 */
public class Pattern9 {
    public static void main(String[] args) {
        int a=1,b=1;
        for(int i=1; i<=4; i++)
        {
            for(int k=4; k>=i; k--)
            {
                System.out.print("  ");
            }
            b=a;
            for(int j=1; j<=i*2-1; j++,b--)
            {
                System.out.print(b+" ");
            }
            System.out.println();
            a=i*2+1;
        }
    }
}

/*
        1 
      3 2 1
    5 4 3 2 1
  7 6 5 4 3 2 1
 */