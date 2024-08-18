
class Sample {
	int x;
	int y;
      public void modify(Sample s) {
       x = s.x + 5;
       s.y = y + 5;
	}
}

public class HeapAndStack {
    public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		System.out.println("x :" + s1.x + ", " + "y :" + s1.y);
		System.out.println("x :" + s2.x + ", " + "y :" + s2.y);   
		s1.modify(s1);
		System.out.println();
		System.out.println("x :" + s1.x + ", " + "y :" + s1.y);		
		System.out.println("x :" + s2.x + ", " + "y :" + s2.y);        
		
		s1.modify(s2);
		System.out.println();
		System.out.println("x :" + s1.x + ", " + "y :" + s1.y);
		System.out.println("x :" + s2.x + ", " + "y :" + s2.y);
	}
}

/*
x :0, y :0
x :0, y :0

x :5, y :5
x :0, y :0

x :5, y :5
x :0, y :10
*/