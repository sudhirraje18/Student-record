package Shiv;

public class Cls_Account
{

	
	int ac_no;
	String name;
	double salary;
	
	void get(int a , String b , double c)
	{
		ac_no=a;
		name=b;
		salary=c;	
	}
	
	void put()
	{
		System.out.println("Account No :"+ac_no);
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
		
	}
	public static void main(String[] args) 
	
	{
		Cls_Account A =new Cls_Account();
		A.get(123, "Shiv", 25640);
		A.put();
	}

}
