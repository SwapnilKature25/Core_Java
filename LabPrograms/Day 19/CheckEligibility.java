 
class VotingEligibility
{
	private String name;
	private int age;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return this.age;
	}
}

public class CheckEligibility 
{
	public static void main(String[] args) 
	{
		VotingEligibility v=new VotingEligibility();
		v.setAge(14);
		v.setName("Swap");
		int age=v.getAge();
		System.out.println(v.getName());
		System.out.println((age > 18) ? "Eligible" : "Not Eligible");
	}
}
