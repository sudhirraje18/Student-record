package Shiv;


public class Cls_Person
{
	
	String name , gender;
	int age;
	
	void get(String a , String b , int c)
	{
		
		name=a;
		gender=b;
		age=c;
	}
	
	void put()
	{
		System.out.println(" Name :" +name);
		System.out.println("Gender:" + gender);
		System.out.println("Age :"+age);
	}

	public static void main(String[] args)
	{
		Cls_Person P = new Cls_Person();
				P.get("Shiv", "Male", 28);
				P.put();
	}

}
