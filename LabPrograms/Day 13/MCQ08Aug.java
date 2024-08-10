/*
class D {
static int x = 10;

public static void m1() {
int x = 20;
System.out.println(x);
System.out.println(D.x);
}
}

public class MCQ08Aug {
public static void main(String[] args) {
D.m1();
}
}

// 20 10
*/




/*
class D {
static int x;
public static void m1(int x) {
x = x;
System.out.println(x);
x = D.x;
System.out.println(D.x);
}
}

public class MCQ08Aug {
public static void main(String[] args) {
D.m1(20);
int x = 30;
System.out.println(x);
}
}
// 20 0 30
*/


/*
class D {
static int x;
public static void m1(int x) {
for (D.x = 15; D.x <= x; D.x++) {
System.out.print(x+" ");
}
System.out.println(x);
}
}

public class TesterMcq {

public static void main(String[] args) {
D.m1(20);
System.out.println(D.x);
}
}

// B.20 20 20 20 20 20 20 21
*/





/*
class D {
static int x=5;
public static void m1(int x) {
while(x!=0) {
D.x=x--;
}
System.out.println(x);
}
}

public class TesterMcq {
public static void main(String[] args) {
D.m1(5);
System.out.println(D.x);
}
}

 // 0 1
*/




/*
class Test {
static int x = 10;
public static void main(String[] args) {
for (int i = 0; i < 2; i++) {
int x = 30;
System.out.print(x + " ");
}
System.out.println(x);
}
}
//0 5 
*/




/*
class D {
static int x=5;
public static void m1(int x) {
while(x!=0) {
x=D.x--;	//
}
System.out.println(x);
}
}

public class TesterMcq {
public static void main(String[] args) {
int x = 5;
D.m1(x);
System.out.println(x);
}
}

A. 0 1
B. 0 -1
C. 0 5
D. 0 0
E. Infinite loop

Ans : C. 0 5

*/





/*
public class Test {
static int x = 5;
void method1() {
int x = 10;
System.out.println(x);	//10
}

static void method2() {
int x = 15;
System.out.println(x);	//15
}

public static void main(String[] args) {
Test obj = new Test();
obj.method1();
method2();
System.out.println(x);	//5
}
}

//10 15 5
*/