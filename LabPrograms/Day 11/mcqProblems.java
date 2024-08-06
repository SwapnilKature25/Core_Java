public class mcqProblems {
    
	/*
	diff ways to declare main method
    static public void main(String... args)
    static public void main(String[] args)
    static public void main(String args[])
    public static void main(String args[])
    final public static void main(String args[])
	*/
    public static void main(String args[])
	{
    /*byte i=10;
    byte j = 10;
    byte z = i * j;
    System.out.println(z);*/
	
	
	// int a = 1;
	// while (false) {
	//     System.out.println(a);
	// }
	// System.out.println(++a);

    // error



    // System.out.println(args[0] + " " + args[args.length-1]);

    /*
    what would be the result of executing the following command line?
>java Args In politics stupidity is not a handicap

Select the one correct answer.

(a) The program will throw an ArrayIndexOutOfBoundsException.
(b) The program will print "java handicap".
(c) The program will print "Args handicap".
(d) The program will print "In handicap".
(e) The program will print "In a".

Ans : (a) The program will throw an ArrayIndexOutOfBoundsException.

        */


	//System.out.println("Valid");
	
	
	
	
	
	/*
	char c = 'A';
What is the simplest way to convert the character value in c into an int?
Select the one correct answer.
(a) int i = c;
(b) int i = (int) c;
(c) int i = Character.getNumericValue(c);

	 

	char c = 'A';
	int i=(int)c;
	//int i = Character.getNumericValue(c);  //10
	System.out.println(i);	//65
	*/
	
	
	/*
	int a, b, c;
	b = 10;
	a = b = c = 20;
	System.out.println(a);		//20
	System.out.println(1 / 2 + 3 / 2 + 0.1);		//1.1   because int + double =double so it will store value in double
	*/
	

	System.out.println(0x10 + 10 + 010);	//34
	System.out.println(-1-3 * 10 / 5-1);	// -1-30/5-1 => -1-6-1=> -8
	
	/*
	int k = 1;
	int i = ++k + k++ + +k; // 2+2+3=7
	System.out.println(i);
	*/
	
	
	
	int x = 5;
	x += 10;
	x = ++x + +10;	
	System.out.println(x);	//26


	/*
	What is the label of the first line that will cause a compile time error in the following program?
public class MyClass {
public static void main(String[] args) {
char c;
int i;
c = 'a'; // (1)
i = c; // (2)
i++; // (3)
c = i; // (4)
c++; // (5)
}
}
Select the one correct answer.
(a) (1)
(b) (2)
(c) (3)
(d) (4)
(e) (5)
(f) None of the above. The compiler will not report any errors.

Ans : d. 4
 */


	
	
	
	/*
	Ques -17
-----------
Which statements are true about the output from the following program?
public class Logic {
public static void main(String[] args) {
int i = 0;
int j = 0;
boolean t = true;
boolean r;
r = (t & 0 < (i+=1));
r = (t && 0 < (i+=2));
r = (t | 0 < (j+=1));
r = (t || 0 < (j+=2));
System.out.println(i + " " + j);
}
}
Select the two correct answers.
(a) The first digit printed is 1.
(b) The first digit printed is 2.
(c) The first digit printed is 3.
(d) The second digit printed is 1.
(e) The second digit printed is 2.
(f) The second digit printed is 3.


Ans :

	
	*/
	int i = 0;
	int j = 0;
	boolean t = true;
	boolean r;
	r = (t & 0 < (i+=1));
	r = (t && 0 < (i+=2));
	r = (t |  (0 < (j+=1)));
	r = (t ||  (0 < (j+=2)));
	System.out.println(i + " " + j);	//3 1



	/*
	if (true)
	if (false)
	System.out.println("a");
	else
	System.out.println("b");		
	}
	
	//b
	*/


	
	
	/*
	What, if anything, is wrong with the following code?
void test(int x) {
switch (x) {
case 1:
case 2:
case 0:
default:
case 4:
}
}
Select the one correct answer.
(a) The variable x does not have the right type for a switch expression.
(b) There is nothing wrong with the code.
(c) Each case section must end with a break statement.
(d) The default label must be the last label in the switch statement.
(e) The body of the switch statement must contain at least one statement.

Ans :   (e) The body of the switch statement must contain at least one statement.

	*/




/*

Find the output of the following program
class Test
{
public static void main(String[] args)
{
byte b =2;
switch(b)
{ case 23:
case -128:
case 128:
}
System.out.println(b);
}
}

a. No output
b. Compile time Error
c. 2

Ans : b. Compile time Error
error: incompatible types: possible lossy conversion from int to byte


*/





	//System.out.println(0X012+0B101+011);		//32
	
	
	System.out.println(10+5+"abc");
	System.out.println("def"+10-5); 
	// error: bad operand types for binary operator '-' System.out.println("def"+10-5);
	//System.out.println("def" + (10 - 5)); // Corrected version



int a=1,b=2,c=4,d;
d = --c + ++a;		//3+2=5
--c + ++b;     //2+3=5
c = d;		//5
d = --d + ++c;	//4+6=10
System.out.println(d);

//error: not a statement --c + ++b; 



	
/*
public class Test
{
public static void main(String[] argv)
{
float f = 10.5f;
double d = (int) f;
f += (char)(d += f += d);	// d=10+20.5=30.5  => f+=d=10.5+30=>40.5
System.out.println(d);
System.out.println(f);
}
}

a. Compile Time Error
b. 30 40
c. 30.0 40.0
d. 30.5 40.5

Ans :d. 30.5 40.5
*/




/*
-----------
public class Abc {

public static void main(String[] argv) {

int $ = 7;
int $_$ = 7;
$+=$_$-=$*=$_$/=$;		
System.out.println($+" "+$_$); 	
}
}

a. Compile Time Error
b. 0 0
c. 7 0
d. 1 1
e. 7 1

Ans :  c. 7 0

*/




/*
public class Abc {

public static void main(String[] argv) {

float f = 2.5f;
double d = 1.5;
System.out.println(++f + d++ + ++f + ++d);	//3.5+1.5+4.5+3.5=13
}
}

a. Compile time error
b. 13.0
c. 13
d. 13.5

Ans :  b. 13.0
*/




	/*
	short myGold = 7;
 System.out.println(countGold(myGold, 6));
	/*
	error: cannot find symbol
 System.out.println(countGold(myGold, 6));
                    ^
  symbol:   method countGold(short,int)
  location: class HelloWorld
  */
 
 
 
	}  
}

//class Hobbit {
// static int countGold(int x, int y) { return x + y; }
// }
