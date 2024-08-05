
/*
Write a Java method to find the smallest number among three numbers.
by creating a method writing the logic inside the method and by calling a method: 

Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29

Expected Output:
The smallest value is 25

Methods:
-------------
name : findSmallest
returnType : void 
methodType : static
parameterType: No argument

Note: [Take the test data value as the local variable inside the method as int type]

 */

 public class FindSmallestNum {

    public static void findSmallest()
    {
        int a=9,b=23,c=9;
        if(a==b && b==c)
        {
            System.out.println("All are equals");
        }
        else if(a<b && a<c)
        {
            System.out.println("The Smallest value is "+a);
        }
        else if(b<c)
        {
            System.out.println("The Smallest value is "+b);
        }
        else {
            System.out.println("The Smallest value is "+c);
        }

    }
    public static void main(String[] args) {
        findSmallest();
    }
}

//The Smallest value is 9