class D
{
	int x;
	int y;
	
	public void m1()
	{
		System.out.println(this.x+" "+this.y);
	}
}

class thisDemo 
{
	public static void main(String[] args) 
	{
		D d1=new D();
		d1.x=10;
		d1.y=20;
		
		D d2=new D();
		d1.m1();
		System.out.println(d1.x+" "+d1.y);
		d2.m1();
		System.out.println(d2.x+" "+d2.y);
		
		
	}
}
