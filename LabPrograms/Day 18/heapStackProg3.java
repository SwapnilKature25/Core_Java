class Sample {
	int x;
	int y;
		public void modify(Sample s) {
		System.out.println("x :" +x +", "+"y :"+y);
		s.x  = 11;
		s.y  = 21;
		System.out.println("x :" +x +", "+"y :"+y);
	}
}
public class heapStackProg3 {
    public static void main(String[] args) {
		Sample s1 = new Sample();
		System.out.println("x :" +s1.x +", "+"y :"+s1.y);
		System.out.println();
		s1.modify(s1);
		System.out.println();
		System.out.println("x :" +s1.x +", "+"y :"+s1.y);
		
	}
}

/*
x :0, y :0

x :0, y :0
x :11, y :21

x :11, y :21
*/
