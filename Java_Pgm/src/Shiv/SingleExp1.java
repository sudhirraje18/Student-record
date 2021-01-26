package Shiv;

import java.util.Scanner;
 class Collage 
{
	
	public String colname = "SB Patil";
	int colcode= 1234;
	
	void display()
	{
		System.out.println(" Collage Name : "+colname);
		System.out.println(" Collage Code :"+colcode);
	}
	
}

class Student extends Collage
{
	 String studname, course ;
	
	Scanner sc= new Scanner(System.in);
	

	
	void get()
	{
		
		System.out.println(" Enter student Name  :");
		studname= sc.nextLine();
		
		System.out.println(" Enter the Course Name :");
		course= sc.nextLine();
	
		
	}
	
	void Display()
	{
		System.out.println(" Student Name :"+studname);
		System.out.println(" Course Name :"+course);
		 display();
	}
	
}

class SingleExp1
{
	public static void main(String args[])
	{
		Student s= new Student();
		s.get();
		s.Display();
	}
}