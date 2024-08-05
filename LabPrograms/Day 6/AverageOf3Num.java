/*
Write a Java method to compute the average of three numbers,
by creating a method writing the logic inside the method and by calling a method: 

Test Data:
Input the first number: 25.0
Input the second number: 45.0
Input the third number: 65.0

Expected Output:
The average value is 45.0

Methods:
-------------
name : findAverage 
returnType : void 
methodType : static
parameterType: No argument

Note: [Take the test data value as the local variable inside the method as float type]

 */

 public class AverageOf3Num {
    /*
    public with static method type
    public static void findAverage()
    {
        float first=25.0f;
        float second=45.0f;
        float third=65.0f;

        float avg=(first+second+third)/3;
        System.out.println("The Average value is "+avg);
    }
    public static void main(String[] args) {
        findAverage();
        AverageOf3Num ag=new AverageOf3Num();
        ag.findAverage();
    }
    */



    /* 
    public with non-static method type 
    public void findAverage()
    {
        float first=25.0f;
        float second=45.0f;
        float third=65.0f;

        float avg=(first+second+third)/3;
        System.out.println("The Average value is "+avg);
    }
    public static void main(String[] args) {
        AverageOf3Num ag=new AverageOf3Num();
        ag.findAverage();
    }
        */




    protected static void findAverage()
    {
        float first=25.0f;
        float second=45.0f;
        float third=65.0f;

        float avg=(first+second+third)/3;
        System.out.println("The Average value is "+avg);
    }
    public static void main(String[] args) {
        // two ways to call static method 
        AverageOf3Num ag=new AverageOf3Num();
        ag.findAverage();
        findAverage();
    }
}

// The Average value is 45.0