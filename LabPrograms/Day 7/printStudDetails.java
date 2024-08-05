/*
1-The program reads the roll number, name, and marks for three subjects from the user.

Method : 

Name :  printStudentDetails 
returnType : void
methodType : static 
Parameters: int rollNo, String name, int physics, int chemistry.

Calculations: Computes the total marks,and average of the student.

Output: Prints all details including the total marks and name , roll number and subject and 
        average. 

Main Method:
It handles user input and calls the printStudentDetails method with the gathered data.
 */

public class printStudDetails {
    static void printStudentDetails(int rollNo, String name, int physics, int chemistry )
    {
        int res=physics+chemistry;
        int avg=res/2;
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(physics);
        System.out.println(chemistry);
        System.out.println(res);
        System.out.println(avg);

    }
    public static void main(String[] args) {
        int rollno,phy,che;
        String name;
        rollno=Integer.parseInt(args[0]);
        name=args[1];
        phy=Integer.parseInt(args[2]);
        che=Integer.parseInt(args[3]);
        printStudentDetails(rollno,name,phy,che);
    }
}


/*
PS C:\Users\swapn\Programs\Java\LabPrograms\Day 7> javac printStudDetails.java
PS C:\Users\swapn\Programs\Java\LabPrograms\Day 7> java printStudDetails  
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at printStudDetails.main(printStudDetails.java:36)
PS C:\Users\swapn\Programs\Java\LabPrograms\Day 7> java printStudDetails 121 Swap 80 80
121
Swap
80
80
160
80
 */