 
class Sample {
	int x;
	int y;
		public void modify(Sample s) {
		x = 11;
		s.y = 21;
		System.out.println("x :" + x + ", " + "y :" + y);  // 11 21
		System.out.println("x :" + s.x + ", " + "y :" + s.y); // 11 21
		s = new Sample();
		s.x = 55;
		s.y = 66;
		System.out.println("x :" + x + ", " + "y :" + y);	//11 21
		System.out.println("x :" + s.x + ", " + "y :" + s.y); // 55 66
	}
}

public class HeapStackProg5 {
    public static void main(String[] args) {
		Sample s1 = new Sample();
		System.out.println("x :" + s1.x + ", " + "y :" + s1.y);	//0 0
                System.out.println();
		s1.modify(s1);
		System.out.println();
		System.out.println("x :" + s1.x + ", " + "y :" + s1.y); // 11 21
	}
}

