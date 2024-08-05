/*
3-The program reads the credit score and monthly income of the applicant from the user using the
  command line arguments.

 Method:

name :checkLoanEligibility
returnType : void
methodType : static
Parameters:  int creditScore , double monthlyIncome 

Logic: Determines eligibility based on:

Credit Score >= 750 and Monthly Income >= $3000.
OR Credit Score >= 650 and Monthly Income >= $5000.
OR Credit Score >= 600 and Monthly Income >= $7000.

Output: Prints the credit score, monthly income, and eligibility result directly from this method.
Main Method:

It handles user input and calls the checkLoanEligibility method with the provided details.

 */
public class CheclLoanEligibile {
    static void checkLoanEligibility(int creditScore, double monthlyIncome){
        if(creditScore >= 750 && monthlyIncome >= 3000)
        {
            System.out.println("Credit Score : "+ creditScore +" Monthly Income : "+monthlyIncome);
            System.out.println("Your are Eligible");
        }
        else if(creditScore >= 650 && monthlyIncome >= 5000){
            System.out.println("Credit Score : "+ creditScore +" Monthly Income : "+monthlyIncome);
            System.out.println("Your are Eligible");
        }
        else if(creditScore >= 600 && monthlyIncome >= 7000){
            System.out.println("Credit Score : "+ creditScore +" Monthly Income : "+monthlyIncome);
            System.out.println("Your are Eligible");
        }
        else {
            System.out.println("Your are not Eligible");
        }
    }
    public static void main(String[] args) {
        checkLoanEligibility(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
    }
}


/*
PS C:\Users\swapn\Programs\Java\LabPrograms\Day 7> java CheclLoanEligibile 100 2000
Your are not Eligible
PS C:\Users\swapn\Programs\Java\LabPrograms\Day 7> java CheclLoanEligibile 800 3400 
Credit Score : 800 Monthly Income : 3400.0
Your are Eligible
 */