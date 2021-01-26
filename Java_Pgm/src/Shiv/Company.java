package Shiv;

import java.util.Scanner;
class Headquarters
{
	int totalemployees; // Data Member 1
	String cityname; // Data Member 2
	Scanner sc=new Scanner(System.in);
	void getDetails()
	{
		System.out.println("Enter City Where Headquarters is Sitiuated :");
		cityname=sc.nextLine();
		System.out.println("Enter Total Number of Employees in Headquarters");
		totalemployees=sc.nextInt();
	}

	void showDetails()
	{
		System.out.println("Company Headquarters is Sitiuated in "+cityname+" and has "+totalemployees+" Employees");
	}
}

class Mainbranch extends Headquarters
{
	void getDetails()
	{
		System.out.println("Enter City Where Main Branch is Sitiuated");
		cityname=sc.nextLine();
		System.out.println("Enter The Total Number of Employees In Main Branch");
		totalemployees=sc.nextInt();
	}

	void showDetails()
	{
		System.out.println("Company Main Branch is Sitiuated in "+cityname+" and has "+totalemployees+" Employees");
	}
}

class Company
{
	public static void main(String args[])
	{
		Headquarters H=new Headquarters();
		H.getDetails();
		H.showDetails();	
		
		Mainbranch M=new Mainbranch();
		M.getDetails(); // Method Calling by Object M works correctly as the features of the HeadQuarters are inherited to Mainbranch
		M.showDetails();// Note That Inheritance provides reusability of code as observed in the above program
	}
}
