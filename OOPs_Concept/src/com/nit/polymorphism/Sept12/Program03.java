
//public class Program03{
//public static void printValue(int i, int j, int k){
//System.out.println("int");
//}
//public static void printValue(byte... b){
//System.out.println("long");
//}
//public static void main(String... args){
//byte b = 9;
//printValue(b,b,b,b);
//}
//}

class A{
public void printValue(){
System.out.println("Value-A");
}
}
class B extends A{
public void printNameB(){
System.out.println("Name-B");
}
}
class C extends A{
public void printNameC(){
System.out.println("Name-C");
}
}
public class Program03{
public static void main (String[] args){
B b = new B();
C c = new C();
newPrint(b);
newPrint(c);
}
public static void newPrint(A a){
a.printValue();
}
}