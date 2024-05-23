class LibraryItem
{
	String title;
	static int itemID;
	
	public void displayInfo()
	{
		System.out.println("Title: "+title);
		System.out.println("Item ID: "+itemID);
	}
}
class Book extends LibraryItem
{
	String author;
	Book(String title, String author)
	{
		this.title=title;
		this.author=author;
        itemID++;
	}
	public void displayInfo()
	{
		System.out.println("Book Information:");
		System.out.println("Title: "+title);
		System.out.println("Item ID: "+itemID);
		System.out.println("Author: "+author);
		System.out.println("Type: BOOK");
	}
}
class DVD extends LibraryItem
{
	String director;
	DVD(String title, String director)
	{
		this.title=title;
		this.director=director;
        itemID++;
	}
	public void displayInfo()
	{
		System.out.println("DVD Information:");
		System.out.println("Title: "+title);
		System.out.println("Item ID: "+itemID);
		System.out.println("Author: "+director);
		System.out.println("Type: DVD");
	}
}
class Q1
{
	public static void main(String[]args)
	{
		Book b1=new Book("ABC","XYZ");
		b1.displayInfo();
		DVD d1=new DVD("SLS","VMT");
		d1.displayInfo();
		DVD d2=new DVD("DFG","SRT");
		d2.displayInfo();
		
	}
}