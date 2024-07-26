
/*
 *  WHAT IS THE VALUE BE PRINTED IF WE DON'T ASSIGN ANY VALUE IN THE 
 *  CLASS LEVEL VARIABLE
 */
public class assignValueWays {
    static boolean  a;
    boolean  b;
    public void m1() {
         int c=20;
         System.out.println(c);
    }
public static void main(String[] args) {
    assignValueWays p=new assignValueWays();
   System.out.println(p.a+" "+p.b);
//    false false
}
}
