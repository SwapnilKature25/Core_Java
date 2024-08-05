/*
Write Java methods to calculate triangle area.
by creating a method writing the logic inside the method and by calling a method: 

Expected Output:

Input Side-1: 10.00                                                                           
Input Side-2: 15.00                                                                             
Input Side-3: 20.00    
                                                                         
The area of the triangle is 72.6184377413890

Methods:
-------------
name : findLeapYear
returnType : void 
methodType : static
parameterType: No argument

Note: [Take the test data value as the local variable inside the method as double type]

Let ABC be a triangle such that the length of the 3 sides of the triangle is AB = c, BC = a and CA = b. Then, the area of triangle ABC = √[s × (s – a) × (s – b) × (s – c)].

semiPerimeter(s)= (side1+side2+side3)/2;

*/

import java.lang.*;
public class AreaOfTriangle {
    public static void findAreaOfTriangle()
    {
        double side1=10.0, side2=15.0, side3=20.0 ,s, area;  
        // semiPerimeter (s)
        s = (side1+side2+side3)/2.0;
        area= Math.sqrt( s * (s-side1) * (s-side2) * (s-side3) );
        System.out.println("The area of triangle is "+area);
    }
    public static void main(String[] args) {
        findAreaOfTriangle();
    }
}

// The area of triangle is 72.61843774138907
