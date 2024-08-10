class CheckCube
{
	public static int getNum(int num)
	{
		int i,j,c,t,cubeNum=0;
		for(i=1; i<num/2; i++)
		{
			c=0;
			t=i;
			c=t*t*t;
			if(c==num)	cubeNum=t;			
		}
		return cubeNum;	
	}
	
	public static void checkCube(int num)
	{
		int cube=getNum(num);
		if(cube>0){
			System.out.println("The "+num+" Number is a Cube of "+cube);
		
		}
		else{
			System.out.println("The is no Cube of "+num);
		}
	}
}

class TestCube 
{
	public static void main(String[] args) 
	{
		CheckCube.checkCube(Integer.parseInt(args[0]));
	}
}


/*
C:\Users\swapn\Programs\Java\LabPrograms\Day 14>java TestCube 125
The 125 Number is a Cube of 5

C:\Users\swapn\Programs\Java\LabPrograms\Day 14>java TestCube 23
The is no Cube of 23
*/