
class Sample {
	int x;
	int y;
		public void modify(Sample s) {
		System.out.println("x :" + x + ", " + "y :" + y);	//0 0
		this.x  = 11;
		this.y  = 21;
		System.out.println("x :" + s.x + ", " + "y :" + s.y); // 11 21
	}
}

public class heapStackProg2 {
    public static void main(String[] args) {
		Sample s1 = new Sample();
		System.out.println("x :" + s1.x + ", " + "y :" + s1.y);	//0 0
		System.out.println();
		s1.modify(s1);
		System.out.println();
		System.out.println("x :" + s1.x + ", " + "y :" + s1.y);		//11 21
	}
}

/*
x :0, y :0

x :0, y :0
x :11, y :21

x :11, y :21
*/
