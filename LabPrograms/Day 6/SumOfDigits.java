public class SumOfDigits {
    public static void numberSum(){
        int num=25,sum=0,rem=0;
        for(int i=1; num!=0; i++)
        {
            rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("The sum is "+sum);
    }
    public static void main(String[] args) {
        numberSum();
    }
}

// The sum is 7