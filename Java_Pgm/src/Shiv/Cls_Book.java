package Shiv;

public class Cls_Book 

{
	String title , author;
	double price;
	
	
	void getdata( String a , String b, double c)
	{
		title= a;
		author=b;
		price= c;
	}
	
	void display()
	{
		System.out.println(" Title of Book: "+ title);
		System.out.println("Author of Book :"+author);
		System.out.println("Price of Book :"+price);
		
	}

	public static void main(String[] args)
	{
		 Cls_Book B= new Cls_Book();
		 B.getdata("Java Programmimg", "Balgurusami", 577.20);
		 B.display();
		 
	
	}

}
