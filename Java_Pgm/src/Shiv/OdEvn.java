package Shiv;

import java.util.Scanner;

public class OdEvn
{

	public static void main(String[] args)
	{
		// int Num=Integer.parseInt(args[0]);
		
		
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Enter any number: ");

	        // This method reads the number provided using keyboard
	        int Num = scan.nextInt();
		
		
		if (Num % 2==0) 
		
		{
			System.out.println("Number is Even ");
		
		} 
		
		else 
		{
			System.out.println("Number is Odd ");
		}
		
		scan.close(); // Need to be close Scanner Class		
	}

}
