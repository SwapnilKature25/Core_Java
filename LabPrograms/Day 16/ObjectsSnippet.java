
class A {
    int value;
	int x;
	int y;
}

public class ObjectsSnippet {
    public static void main(String[] args) {
       /*
		A obj1 = new A();
        A obj2 = new A();
        
        obj1.value = 5;
        obj2.value = 10;
        
        obj1 = obj2;
        obj1.value = 15;

        System.out.println("obj1.value: " + obj1.value);
        System.out.println("obj2.value: " + obj2.value);
		*/
		
		
		
		/*
		A obj1 = new A();
        A obj2 = obj1;
        A obj3 = new A();
        
        obj1.value = 20;
        obj2.value = 30;
        obj3.value = 40;
        
        obj1 = obj3;
        obj1.value = 50;

        System.out.println("obj1.value: " + obj1.value);
        System.out.println("obj2.value: " + obj2.value);
        System.out.println("obj3.value: " + obj3.value);
		*/
	
	/*
	obj1.value: 50
	obj2.value: 30
	obj3.value: 50
	*/
	
	
	
		/*
		A x = new A();
        A y = new A();
        
        x.value = 10;
        y.value = 20;
        
        x = y;
        x.value = 30;
        y.value = 40;

        System.out.println("x.value: " + x.value);	//40
        System.out.println("y.value: " + y.value);  //40
	
		*/
		
		
		/*
		 A obj1 = new A();
        A obj2 = new A();
        
        obj1.x = 5;
        obj1.y = 10;
        
        obj2.x = 15;
        obj2.y = 20;
        
        obj1 = obj2;
        obj1.x = 25;
        obj2.y = 30;

        System.out.println("obj1.x: " + obj1.x);
        System.out.println("obj1.y: " + obj1.y);
        System.out.println("obj2.x: " + obj2.x);
        System.out.println("obj2.y: " + obj2.y);
		*/
		
		/*
		obj1.x: 25
obj1.y: 30
obj2.x: 25
obj2.y: 30
		*/
		
		
		/*
		A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();
        
        obj1.x = 10;
        obj1.y = 20;
        
        obj2.x = 30;
        obj2.y = 40;
        
        obj3.x = 50;
        obj3.y = 60;
        
        obj1 = obj2;
        obj2 = obj3;
        
        obj1.x = 70;
        obj2.y = 80;

       
		System.out.println("obj1.x: " + obj1.x);	//70
        System.out.println("obj1.y: " + obj1.y);	//40
        System.out.println("obj2.x: " + obj2.x);	//50
        System.out.println("obj2.y: " + obj2.y);	//80
        System.out.println("obj3.x: " + obj3.x);	//50
        System.out.println("obj3.y: " + obj3.y);	//80
		*/
	}
}



