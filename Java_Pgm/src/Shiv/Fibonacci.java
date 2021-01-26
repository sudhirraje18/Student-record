package Shiv;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args)
	{
       int f1 , f2 , f3, num;
       f1=f2=1;
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println(" Enter the Number :");
       num= sc.nextInt();
       sc.close();
       
       for (int i = 0; i<=num; i++)
       {
		f3=f1+f2;
		
		System.out.println(f3);
		f1=f2;
		f2=f3;
		
	   }

	}

}
