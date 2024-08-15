import java.util.Scanner;
class Batsman
{
	String name;
	int runs;
	int matches;
	float batting_avg;
	
	public void setBatsmanValues(String name,int runs,int matches)
	{
		
		this.name=name;
		this.runs=runs;
		this.matches=matches;
	}
	
	public void computeBattingAverage()
	{
		if(runs<0 || matches<0)
		{
			System.err.println("Error");
		}
		else if(runs>0 && matches==0)
		{
			System.err.println("Error");
		}
		else {
			batting_avg=runs/matches;
		}
	}
	
	public void getStatistics()
	{
		System.out.println("<><><><><><><><><><><><><><><><><>");
		System.out.println("Name of Batsman : "+name);
		System.out.println("Runs Scored : "+runs);
		System.out.println("Matches Played : "+matches);
		System.out.println("Batting Average : "+batting_avg);
		System.out.println("<><><><><><><><><><><><><><><><><>");
	}
}

class  TestBatsman
{
	public static void main(String[] args) 
	{
		int runs,matches;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Batsman Name : ");
		name=sc.next();
		System.out.print("Enter Runs Scored : ");
		runs=sc.nextInt();
		System.out.print("Enter No. of Matches Played : ");
		matches=sc.nextInt();
		Batsman b=new Batsman();
		b.setBatsmanValues(name,runs,matches);
		b.computeBattingAverage();
		b.getStatistics();
	}
}



/*
Enter Batsman Name : Rohit
Enter Runs Scored : 10000
Enter No. of Matches Played : 110
<><><><><><><><><><><><><><><><><>
Name of Batsman : Rohit
Runs Scored : 10000
Matches Played : 110
Batting Average : 90.0
<><><><><><><><><><><><><><><><><>
*/