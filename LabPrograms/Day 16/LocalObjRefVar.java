 
class Data {
    int p;
    int q;
    
    void update(Data obj) {
        Data localData = new Data();
        localData.p = 200;
        localData.q = 300;
        System.out.println("localData.p: " + localData.p);
        System.out.println("localData.q: " + localData.q);
        obj.p = localData.q;
        obj.q = localData.p;
    }
}

public class LocalObjRefVar {
    public static void main(String[] args) {
        Data first = new Data();
        first.p = 50;
        first.q = 60;

        Data second = first;

        second.update(first);
        System.out.println("first.p: " + first.p);
        System.out.println("first.q: " + first.q);
        System.out.println("second.p: " + second.p);
        System.out.println("second.q: " + second.q);
    }
}


/*
localData.p: 200
localData.q: 300
first.p: 300
first.q: 200
second.p: 300
second.q: 200
*/








class Data {
    int x;
    int y;
    
    void update(Data obj) {
        Data local1 = new Data();
        Data local2 = new Data();
        local1.x = 500;
        local1.y = 600;
        local2.x = 700;
        local2.y = 800;
        
        System.out.println("local1.x: " + local1.x);
        System.out.println("local1.y: " + local1.y);
        System.out.println("local2.x: " + local2.x);
        System.out.println("local2.y: " + local2.y);
        
        obj.x = local2.x;
        obj.y = local1.y;
    }
}

public class Test7 {
    public static void main(String[] args) {
        Data first = new Data();
        first.x = 10;
        first.y = 20;

        Data second = new Data();
        second.x = 30;
        second.y = 40;

        first.update(second);
        
        System.out.println("first.x: " + first.x);
        System.out.println("first.y: " + first.y);
        System.out.println("second.x: " + second.x);
        System.out.println("second.y: " + second.y);
    }
}
