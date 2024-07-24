/*
 *   0
     0  1
     0  1  1
     0  1  1  2
     0  1  1  2   3

 */
public class Pattern3 {
    public static void main(String[] args) {
 
        for(int i=1; i<=5; i++)
        {
            for(int j=1,a=0,b=1,c; j<=i; j++)
            {
                System.out.print(a+" ");   
                c=a+b;      
                a=b;      
                b=c;       
            }
            System.out.println();
        }
    }
}

/*
0 
0 1
0 1 1
0 1 1 2
0 1 1 2 3
 */