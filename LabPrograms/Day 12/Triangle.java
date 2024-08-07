
class Triangle 
{
	static String findTriangle(int s1,int s2, int s3)
	{
		if( (s1==0 || s2==0 || s3==0)){
			return "1";
		}
		else if(s1<0 || s2<0 || s3<0)
		{
			return "2";
		}
		else if((s1+s2)<s3 || (s1+s3)<s2 || (s2+s3)<s1){
			return "3";
		}
		else if(s1!=s2 && s2!=s3 && s1!=s3){
			return "SCALENE Triangle";
		}
		else if((s1==s2) && (s2==s3)){
		    return "EQUILATERAL Triangle";
		}
		else {
			return "ISOSCELES Triangle";
		}
	}
	public static void main(String[] args) 
	{
		String res=findTriangle(4,7,5);
		System.out.println(res);
	}
}

//SCALENE Triangle

/*

2
-------------
Define a method which accepts 3 values as number and checks and returns the name of the type of triangle generated.
Write the method with the following specifications:
Name of method findTriangle()
Arguments: three arguments of type integers
Return Type: String

Specifications: The value returned by the method findTriangle() is determined by the following rules:
Values must not be 0. If yes, then return -1 as string.
Values must not be negative. If yes, then return -2 as string.
Sum of two sides must be greater than the third side. If no, then return -3 as string
If it’s a triangle with valid sides, then return as string whether the triangle formed is EQUILATERAL, ISOSCELES or SCALENE.
*/

