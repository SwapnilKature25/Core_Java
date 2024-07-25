/*
        1 
      3 2 1
    5 4 3 2 1
  7 6 5 4 3 2 1
 */
public class Pattern10 {
    public static void main(String[] args) {
        int i,j,k,a;
        for(i=1; i<=4; i++)
        {
            for(k=4; k>=i; k--)
            {
                System.out.print("  ");
            }
            for(j=1,a=1; j<=i*2-1; j++)
            {
                if(i==j || j>i)
                {
                    System.out.print(a-- +" ");
                }
                else {
                    System.out.print(a++ +" ");
                }
            }
            System.out.println();
        }
    }
}

/*
        1 
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
 */