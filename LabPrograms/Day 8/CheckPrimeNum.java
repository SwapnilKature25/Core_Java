/*
Program-20
-----------------------------
Write a java program to check the number is prime or not by creating the method and 
by checking the requirement 

Method name: checkPrime 
Method type: non static 
Method return type : Boolean 
Method parameter : one parameter of int type 

get the return result back to the calling place and based on the return result 
print the number is prime or not 

if true result back from the method "then the number is prime"
else " not prime".

 */
public class CheckPrimeNum {
    Boolean checkPrime(int num)
    {
        for(int i=2; i<=num/2; i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        CheckPrimeNum cp=new CheckPrimeNum();
        if(cp.checkPrime(Integer.parseInt(args[0]))) {
            System.out.println("Number is Prime");
        }
        else {
            System.out.println("Number is not a Prime");
        }
    }

}


/*
PS C:\Users\swapn\Programs\Java\LabPrograms\Day 9> javac CheckPrimeNum.java
PS C:\Users\swapn\Programs\Java\LabPrograms\Day 9> java CheckPrimeNum 11         
Number is Prime                                                                  
PS C:\Users\swapn\Programs\Java\LabPrograms\Day 9> java CheckPrimeNum 12
Number is not a Prime
 */