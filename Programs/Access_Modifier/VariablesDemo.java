public class VariablesDemo {
    static int a=10;
    int b=10;

    public static void main(String[] args) {
        int a=20;
        VariablesDemo st=new VariablesDemo();
        // static variable
        System.out.println(st.a);           //10
        System.out.println(VariablesDemo.a);        //10



        // non-static variable
        System.out.println(st.b);           //10
        // System.out.println(VariablesDemo.a);        //error: non-static variable a cannot be referenced from a static context
    }
}

