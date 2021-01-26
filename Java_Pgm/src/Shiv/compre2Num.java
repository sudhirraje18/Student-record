package Shiv;

import java.util.Scanner;

public class compre2Num 
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		 
		System.out.println(" Enter Two Number for Comparisen :");
		
		int Num1=sc.nextInt();  // , Num2= sc.nextInt(); we can declare both way
	    int Num2= sc.nextInt();

		
		if (Num1> Num2)
		{
			System.out.println(" Num1 is Greater :" +Num1);
		} 
		else 
		
		{
			System.out.println(" Num2 is Greater :" +Num2);
		}
	
	sc.close();
	}

}
