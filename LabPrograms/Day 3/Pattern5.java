public class Pattern5 {
    public static void main(String[] args) {
        int b=0;
        for(int i=1; i<=5; i++)
        {
            for(int j=1,a=1; j<=i; j++)
            {
                if(i==j || j==1){
                    System.out.print(a+" ");
                }
                else if(i%2==0){ 
                    b+=2;
                    System.out.print(b + " ");
                }
            }
            System.out.println();
        }
    }
}
