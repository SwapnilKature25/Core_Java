class Inventory
{
	static int totalItems;
	void addItem(int quantity)
	{
		totalItems+=quantity;
		System.out.println("items added : "+quantity);
		System.out.println("Total number of items Remained : "+totalItems);
	}
	void removeItem(int quantity)
	{
		totalItems-=quantity;
		System.out.println("items removed : "+quantity);
		System.out.println("Total number of items Remained : "+totalItems);
	}
	public static void main(String[] args) 
	{
		Inventory i=new Inventory();
		i.addItem(Integer.parseInt(args[0]));
		i.removeItem(Integer.parseInt(args[1]));
		
	}
}
