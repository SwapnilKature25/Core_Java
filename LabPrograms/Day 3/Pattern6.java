/*
 * 1 
   0  1
   1  0   1
   0  1   0  1
   1  0   1  0   1 
 */
public class Pattern6 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print((i+j)%2 + " ");
                
            }
            System.out.println();
        }
    }
}
