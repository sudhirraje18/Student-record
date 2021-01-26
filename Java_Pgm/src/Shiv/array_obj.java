package Shiv;

import java.util.Scanner;

class array_obj
{
	String Stude_name ;
	int rollno;
	
   Scanner sc = new Scanner(System.in);
   
   void accept()
   {
	   System.out.println(" Enter Student Name :");
	   Stude_name =sc.next();
	   
	   System.out.println(" Enter Student Roll No :");
	   rollno= sc.nextInt();
	   
   }
   
   void display()
   {
	   System.out.println(" Student Name :" + Stude_name);
	   System.out.println(" Roll Number  :" +rollno);
   }

	

	public static void main(String[] args)
	{
		//array_obj a = new array_obj();
		array_obj A []= new array_obj[3];
		
		for (int i = 0; i < 3; i++) 
		{
			A[i]= new array_obj();
		}
		
		
		for (int i = 0; i < 3; i++) 
		{
			 A[i].accept();
		}
		
		for (int i = 0; i < 3; i++) 
		{
			A[i].display();
		}
   	
	//	a.accept();
	//	a.display();
	}

}
