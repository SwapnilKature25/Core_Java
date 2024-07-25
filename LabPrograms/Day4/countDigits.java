/*
4. Write a java program to count the number of digit and it's sum of the given number . 
input 12345
output 
no. of digit = 5.
sum of digit = 15.
 */
import java.util.*;;
public class countDigits {
    public static void main(String[] args) {
        int n,i,j,c=0,r=0,s=0;
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1; n!=0; n=n/10)
        {
            c++;
            r=n%10;
            s+=r;
        }
        System.out.println("Number of Digit = "+c);
        System.out.println("Sum of Digit = "+s);
    }
}

/*
Enter a number 
12345
Number of Digit = 5
Sum of Digit = 15
 */