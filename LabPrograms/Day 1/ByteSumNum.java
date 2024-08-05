class ByteSumNum 
{
	public static void main(String[] args) 
	{
		//byte b1=10;
		//byte b2=20;
		 
		//System.out.println("Byte Add is : "+(b1+b2));		//Byte Add is : 30
		
		//byte res=b1+b2;
		//byte res=b1+10;			// error: incompatible types: possible lossy conversion from int to byte
		//System.out.println("Byte Add is : "+res);		// error: incompatible types: possible lossy conversion from int to byte
		
		//byte res=(byte)b1+b2;
		//System.out.println("Byte Add is : "+res);   // error: incompatible types: possible lossy conversion from int to byte
		
		//byte res=(byte)b1+(byte)b2;				//error: incompatible types: possible lossy conversion from int to byte
		//byte res=(byte)(b1+b2);						//Byte Add is : 30
		//byte res=10+20;							//Byte Add is : 30
		//byte res=110+120;							//error: incompatible types: possible lossy conversion from int to byte
		
		
		//byte b1=10L;		// error: incompatible types: possible lossy conversion from long to byte
		//byte b2=20;
		//byte res=b1+b2;			// error: incompatible types: possible lossy conversion from long to byte
		
		//byte b1=(byte)10L;		// error: incompatible types: possible lossy conversion from long to byte
		//byte b1=(int)10L;			//// error: incompatible types: possible lossy conversion from long to byte
		
		//byte b1=20L;		
		//byte b2=(int)b1;
		//byte res=b1+b2;			// error: incompatible types: possible lossy conversion from long to byte
		
		//final byte b1=20;		
		//byte b2=b1+10;
		//byte res=b2;		 // Byte Add is : 30
		
		
		//final byte b1=20;		
		//final byte b2=10;
		//byte res=b1+b2;		 //Byte Add is : 30
		
		
		final byte b1;		
		final byte b2;
		b1=10;
		b2=20;
		byte res=b1+b2;			//error: incompatible types: possible lossy conversion from int to byte
		
		System.out.println("Byte Add is : "+res);   // Byte Add is : 30
		
		
		
		
		
	}
}
