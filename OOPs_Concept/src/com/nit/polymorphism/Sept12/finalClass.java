package com.nit.polymorphism.Sept12;

//final class A
//{
//int i;
//}
//class B extends A
//{
//int j;
//System.out.println(j + " " + i);
//}
//
//class finalClass
//{
//public static void main(String args[])
//{
//B obj = new B();
////obj.display();
//}
//}


class A0
{
int i;
public void display()
{
System.out.println(i);
}
}
class B0 extends A0
{
int j;
public void display()
{
System.out.println(j);
}
}
class finalClass
{
public static void main(String args[])
{
B0 obj2 = new B0();
obj2.i = 1;
obj2.j = 2;
A0 r;
r = obj2;
r.display();
}
}