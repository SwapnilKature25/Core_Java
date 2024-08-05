class CBSEResult
{
	static void acceptDetailAndSubmit(String studentName, long rollNo, String schoolRegNo, String schoolName, char gender, String citizenship, String board)
	{
		CBSEResult cs=new CBSEResult();
		
		if(schoolRegNo.equals("CBSE01-100") && ( citizenship.equals("INDIA") || citizenship.equals("india")) && board.equals("CBSE"))
		{
			int math,sci,eng,sst,phye;
			math=90;
			sci=85;
			eng=50;
			sst=90;
			phye=100;
			char grade=cs.calculateGrade(math,sci,eng,sst,phye);
			cs.displayDetails(studentName,rollNo, schoolRegNo, schoolName, gender, citizenship, board, math,sci, eng,sst,phye, grade);
		}
		else{
			System.out.println("The form submission is not accepted");
		}
	}
	public char calculateGrade(int math,int sci,int eng, int sst, int phye)
	{
		int avg=(math+sci+eng+sst+phye)/5;
		char grade;
		if(avg<=100 && avg>80){
			return grade='A';
		}
		else if(avg<=80 && avg>60){
			return grade='B';
		}else if(avg<=60 && avg>40){
			return grade='C';
		}else{
			return grade='D';
		}
	}
	public void displayDetails(String studentName,long rollNo, String schoolRegNo,String  schoolName,char gender,String citizenship,String board,int math,int sci,int eng,int sst,int phye,char grade)
	{
		System.out.println("The name of student : "+studentName);
		System.out.println("The Roll No : "+rollNo);
		System.out.println("The School Reg No : "+schoolRegNo);
		System.out.println("The School Name : "+schoolName);
		System.out.println("Gender : "+gender);
		System.out.println("Citizenship : "+citizenship);
		System.out.println("Board : "+board);
		System.out.println("__________________________________________");
		System.out.println("_________________MARKS____________________");
		System.out.println();
		System.out.println("\t Math\t\t "+math);
		System.out.println("\t Science\t "+sci);
		System.out.println("\t English\t "+eng);
		System.out.println("\t Social Science\t "+sst);
		System.out.println("\t Physical Edu\t "+phye);
		System.out.println("__________________________________________");
		System.out.println("_________________GRADE____________________");
		System.out.println();
		System.out.println("THE TOTAL MARKS AS GRADE IS "+grade);
		
		
	}
	public static void main(String[] args) 
	{
		acceptDetailAndSubmit("Rohit", 00000045, "CBSE01-100", "RPEMS",'M',"INDIA","CBSE");
	}
}


/*

The name of student : Rohit
The Roll No : 37
The School Reg No : CBSE01-100
The School Name : RPEMS
Gender : M
Citizenship : INDIA
Board : CBSE
__________________________________________
_________________MARKS____________________

         Math            90
         Science         85
         English         50
         Social Science  90
         Physical Edu    100
__________________________________________
_________________GRADE____________________

THE TOTAL MARKS AS GRADE IS A

*/