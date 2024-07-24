/*
     1  
     1 2 1
     1 2 3 2 1 
     1 2 3 4 3 2 1
     1 2 3 4 5 4 3 2 1 
 */
public class Pattern4 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            for(int j=1,a=1; j<=i*2-1; j++)
            {
                if(i==j || i<j){
                    System.out.print(a-- + " ");
                }
                else{
                    System.out.print(a++ + " ");
                }
            }
            System.out.println();
        }
    }
}
