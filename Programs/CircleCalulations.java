/*
Suppose the radius of a circle is stored as 3.7cm.Calculate and
display the area of the circle and circumference of circle.
*/

class CircleCalulations 
{
	public static void main(String[] args) 
	{
		double radius = Double.parseDouble(args[0]); // Radius of the circle
        // Calculate area of the circle
        //double area = Math.PI * radius * radius;
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle: " + area);

        // Calculate circumference of the circle
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of the circle: " + circumference);
	}
}
/*
C:\Users\swapn\Programs\Java\Programs>javac CircleCalulations.java

C:\Users\swapn\Programs\Java\Programs>java CircleCalulations 3.7
Area of the circle: 42.9866
Circumference of the circle: 23.236
*/
