class Finding{
    static void even(int num)
    {
        if(num%2==0)
        {
            System.out.println("it is even number ");
        }
		else   System.out.println("it is not even number ");
    }
    static void odd(int num)
    {
        if(num%2==1)
        {
            System.out.println("it is Odd number ");
        }
		else System.out.println("it is Odd number ");
    }
}

class evenOdd{
    public static void main(String[] args) {
        Finding.even(12);
        Finding.odd(13);
    }
}