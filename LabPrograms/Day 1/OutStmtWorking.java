class Swapnil
{
	public static void print(String value)
	{
		System.out.println(value);
	}
}

class OutStmtWorking
{
	public static void main(String[] args) 
	{
		Swapnil.print("My Class");
		Swapnil s=new Swapnil();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		System.out.println(s.toString());
	}
}

/*
My Class
class Swapnil
1072591677
Swapnil@3fee733d
*/