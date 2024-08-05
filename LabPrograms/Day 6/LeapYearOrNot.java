/*
Write a Java method to check whether a year (integer) entered by the user
is a leap year or not.
by creating a method writing the logic inside the method and by calling a method: 

Input a year: 2017 
Expected Output:
false

Methods:
-------------
name : findLeapYear
returnType : void 
methodType : static
parameterType: No argument

Note: [Take the test data value as the local variable inside the method as long type]

 */
public class LeapYearOrNot {
    public static void findLeapYear(){
        long year=1700;
        boolean leap=false;

        if(year%4==0 && (year%400==0))
        {
            leap=true;
        }
        System.out.println(leap);
    }
    public static void main(String[] args) {
        findLeapYear();
    }
}

//false