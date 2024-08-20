class D
{
	// we cannot use this keyword in static method instead of it we use className
	String name;
	public D(String name)
	{
		setName(name);
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void getName()
	{
		System.out.println(name);
	}
}

class thisConstructor 
{
	public static void main(String[] args) 
	{
		D d=new D("HK");
		d.getName();
	}
}
