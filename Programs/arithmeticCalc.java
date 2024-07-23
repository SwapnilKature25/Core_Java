/*
1. WAP to store two integers and display the following:
a. addition
b. difference
c. product

*/
//import java.lang.*;
class arithmeticCalc 
{
	public static void main(String[] args) 
	{
		String a = args[0]; 
        String b = args[1]; 
        
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
		
        // Addition
		int add= num1+num2;
        System.out.println("Addition: " + add);
        
        // Difference
        int diff = num1 - num2;
        System.out.println("Difference: " + diff);
        
        // Product
        int product = num1 * num2;
        System.out.println("Product: " + product);
	}
}

/*
java arithmeticCalc 10 5
Addition: 15
Difference: 5
Product: 50
*/
