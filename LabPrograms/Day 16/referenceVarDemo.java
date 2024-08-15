

class Data {
    int a;
    int b;
    void modify(Data obj) {
        Data temp = new Data();
        temp.a = 100;
        temp.b = 200; 
        obj.a = 300;
        obj.b = 400;
	}
}

public class referenceVarDemo {
    public static void main(String[] args) {
        Data first = new Data();
        first.a = 10;
        first.b = 20;
        Data second = first;
        second.modify(first);
        System.out.println("first.a: " + first.a);	//300
        System.out.println("first.b: " + first.b);	//400
        System.out.println("second.a: " + second.a); //300
        System.out.println("second.b: " + second.b); //400
    }
}


