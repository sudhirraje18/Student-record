package Shiv;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	
	{
		
	
		
		int result=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		sc.close();
		
		for(;num>0;num--)        //  while(num>0)
		{
			result= result*num;
			//num--;
		}
	
		System.out.println(" Factorial is :" +result );
	}

}
