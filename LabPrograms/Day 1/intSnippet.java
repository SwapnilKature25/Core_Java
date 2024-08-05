class intSnippet 
{
	public static void main(String[] args) 
	{
		 int i1 = 10;
		String i2 = "20";
		int result = i1+i2;
		System.out.println(result);   // error: incompatible types: String cannot be converted to int int result = i1+i2;
        
		int i1 = 10;
		String i2 = "20";
		String result = i1+i2;
		System.out.println(result);
	}
}
