import java.util.*;
class Book
{
	private String title;
	private String author;
	private String isbn;
	private double price;
	private double discountPercentage;
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public void setIsbn(String isbn)
	{
		this.isbn=isbn;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setDiscountPercentage(double discountPercentage)
	{
		this.discountPercentage=discountPercentage;
	}
	
	
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getIsbn()
	{
		return isbn;
	}
	public double getPrice()
	{
		return price;
	}
	public double getDiscountPercentage()
	{
		return discountPercentage;
	}
	
	
	public double getFinalPrice()
	{
		double finalPrice=price - (price * discountPercentage/100);
		return finalPrice;
	}
}

class BookTester
{
	public static void main(String[] args) 
	{
		Book b=new Book();
		String title,author,isbn;
		double price,dPercentage;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Title of Book : ");
		title=sc.nextLine();
		System.out.print("Enter Author Name : ");
		author=sc.nextLine();
		System.out.print("Enter ISBN : ");
		isbn=sc.nextLine();
		System.out.print("Enter Price : ");
		price=sc.nextDouble();
		System.out.print("Enter Discount Percentage : ");
		dPercentage=sc.nextDouble();
		
		b.setTitle(title);
		b.setAuthor(author);
		b.setIsbn(isbn);
		b.setPrice(price);
		b.setDiscountPercentage(dPercentage);
		
		System.out.println("Final Price of Book is  : "+b.getFinalPrice());
		System.out.println("Title of Book : "+b.getTitle());
		System.out.println("Author Name : "+b.getAuthor());
		System.out.println("ISBN : "+b.getIsbn());
		System.out.println("Price : "+b.getPrice());
		System.out.println("Discount Percentage : "+b.getDiscountPercentage());
		
	}
}


/*
Enter Title of Book : 3k Stiches
Enter Author Name : Sudha Murthy
Enter ISBN : Real Story
Enter Price : 250
Enter Discount Percentage : 10
Final Price of Book is  : 225.0
Title of Book : 3k Stiches
Author Name : Sudha Murthy
ISBN : Real Story
Price : 250.0
Discount Percentage : 10.0
*/