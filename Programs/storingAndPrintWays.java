
public class storingAndPrintWays {
	int a = 10;

	public static void main(String[] args) {
		storingAndPrintWays p1 = new storingAndPrintWays();
                // By storing and printing the variable
		
		 int result01=p1.a; 
		 System.out.println(result01); 
		 int result02=p1.a+20;
		  System.out.println(result02);
		 

                // By directly printing the variable from system.out.println() method
		System.out.println(p1.a);
		int a = 5;
		p1.a = p1.a + 10;
		System.out.println(p1.a);

	}
}

/*
10
30
10
20
 */