/*
WAP to store principal,rate of interest and time.Calculate
and display the simple interest.
*/

class simpleInterest 
{
	public static void main(String[] args) 
	{
		/*  optional 
		String a=args[0];
		String b=args[1];
		String c=args[2];  */
		
		double principal = Double.parseDouble(args[0]); // Principal amount
        double rateOfInterest = Double.parseDouble(args[1]); // Rate of interest
        double time = Double.parseDouble(args[2]); // Time in years

        // Calculate simple interest
        double simpleInterest = (principal * rateOfInterest * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
	} 
}

//java simpleInterest 1000 5 4
//Simple Interest: 200.0
