public class ClassA {

	// String meth1(int a,int b) {		//4,8
	// 	System.out.println(10);		//3
	// 	System.out.println((54+a)-b);	//4 (54+4)-8 =50
	// 	ClassA aobj = new ClassA();
	// 	int value=aobj.meth5();		//---3  (20)
	// 	System.out.println(value);	//8 (20)
	// 	return "java";			// java
		
	// }
	
	// int meth2(int a) {
	// 	System.out.println(75);		//6
	// 	int b=5;
	// 	System.out.println(b-a);	//7 (5-5=0)
	// 	return (5*5)-b;			//(25)-5=20
	// }
	// void meth3()	
	// {
	// 	System.out.println("Start");	//1
	// 	ClassA aobj = new ClassA();
	// 	String msg=aobj.meth4();	//---1 (java)
	// 	System.out.println(msg);	//9 (java)
	// 	System.out.println(40);		//10
	// }
	// public String meth4() {
	// 	System.out.println("Today is Thrusday");	//2
	// 	ClassA aobj = new ClassA();
	// 	return aobj.meth1(4, 8);	//---2 (java)
	// }
	// public int meth5() {
	// 	ClassA aobj = new ClassA();
	// 	System.out.println(99);		//5
	// 	return aobj.meth2(5);		//---4  (20)
	// }
	// public static void main(String[] args) {
	// 	ClassA aobj=new ClassA();
	// 	aobj.meth3();
	// }



    String meth1(int x) {
		System.out.println(x);
		return "java";
	}
	int meth2(int x,int y,int z) {
		System.out.println("meth2() Called");
		return (x*y)-z;		//0
	}
	int meth3(char c)
	{
		System.out.println("meth3() called");
		System.out.println("c: "+c);
		System.out.println(c++);
		System.out.println(++c);
		System.out.println(c+1);
        
		return 100;
	}
	public static void main(String[] args) {
		ClassA aobj = new ClassA();
		System.out.println(aobj.meth1(100)+"is awesome");
		int val=aobj.meth2(5, 10, 50)+aobj.meth3('A')+5;
		System.out.println("val: "+val);
	}

}


