/*
4-The program reads the gender and age of a person from the user using the command line argument.

 Method:

name : determineAndPrintEligibility
returnType : void
methodType : static
Parameters:  char gender , int age 

Logic: Determines eligibility based on the given criteria using if-else statements:

For Males: Age should be 21 or above.
For Females: Age should be 18 or above.

Output: Prints the gender, age, and eligibility result directly from this method.

Main Method:

It handles user input and calls the determineAndPrintEligibility method with the gender and age.

 */
public class eligibility {
    static void determineAndPrintEligibility(char gender, int age){
        if((gender=='M' || gender=='m') && age>21){
            System.out.println("Gender : "+gender);
            System.out.println("Age : "+age);
            System.out.println("You are Eligible ");
        }
        else if((gender=='F' || gender=='f') && age>18){
            System.out.println("Gender : "+gender);
            System.out.println("Age : "+age);
            System.out.println("You are Eligible ");
        }
        else {
            System.out.println("You are not Eligible ");
        }
    }
    public static void main(String[] args) {
        determineAndPrintEligibility(args[0].charAt(0),Integer.parseInt(args[1]));
    }
}


/*
PS C:\Users\swapn\Programs\Java\LabPrograms\Day 7> javac eligibility.java   
PS C:\Users\swapn\Programs\Java\LabPrograms\Day 7> java eligibility f 17    
You are not Eligible 
 */