public class SnippetPrograms {
    /*
    int a=20;
	public static void main(String[] args) {
		int a=10;
		System.out.println(a);      //10
	}
    */



    /*
    int a=20;
	public static void main(String[] args) {
		 a=10;
		System.out.println(a);      //error: non-static variable a cannot be referenced from a static context
	}
    */


    /*
    static int a=20;
	public static void main(String[] args) {
		//  a=10;
		// System.out.println(a);      //10
		System.out.println(a + ' ');      //42
	}
    */




    /*
    static int a=20;
	public static void main(String[] args) {
		
		System.out.println(' '*10+'A');     //32*10+65=385
	}
    */



    /*
    int a=100;
	 a=30;
	public static void main(String[] args) {
		
        // to access instance variable in static method we have to create object
		System.out.println(a);        //// Cannot make a static reference to the non-static field 
	}
    */




    /*
    public static void main(String[] args) {
		int a=259;
		byte k=(byte) a;        //259-256=3
		 
		System.out.println(k);      //3
	}

    Why the Output is 3
    The binary representation of 259 in 32 bits (int) is:
    0000 0000 0000 0000 0000 0001 0000 0011

    When casting to a byte (8 bits), only the lowest 8 bits are kept:
    0000 0011

    The binary 0000 0011 represents the decimal value 3.
    Thus, after casting 259 to a byte, the value becomes 3, which is then printed to the console.
    */


    
    /*
    static double a=100f;
	public static void main(String[] args) {
		
		System.out.println(a);      //100.0
	}
    */





    // public static void main(String[] args) {
	// 	double a=65+'A'+67;
	// 	System.out.println(a);      //197.0
	// }




    /*
    double a;

	public static void main(String[] args) {
		SnippetPrograms p=new SnippetPrograms();
		 p.a=65+'A'+67;
		// System.out.println(a);      //error: non-static variable a cannot be referenced from a static context
	}
    */







    public static void main(String[] args) {
		
    //     double a=11.0;
    //     int b=11;
    //    System.out.println(a==b);        //true
    //    System.out.println(' '+65+" "+67);   //97 67



        // int a=10;
		// long b=a;
		// double c=b;
		// // Double c=b;  here Double is a wrapper class
		 
		// System.out.println(c);      //10.0


        char c=9;
		int k=c;
		 
		System.out.println(k);      //9



        Long l=9l;
		int m=l;
		 
		System.out.println(m);      //error: incompatible types: Long cannot be converted to int




   }



    




}
