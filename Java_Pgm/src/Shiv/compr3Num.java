package Shiv;

import java.util.Scanner;

public class compr3Num {

	public static void main(String[] args) 
	
	{
		
		Scanner sc= new Scanner(System.in);
		 
		System.out.println(" Enter Three Number for Comparison :");
		
		int Num1=sc.nextInt();  
	    int Num2= sc.nextInt();
	    int Num3= sc.nextInt();
	    sc.close();
	    
	    
	    if (Num1>Num2) 
	    {
			if (Num1>Num3)
			{
				System.out.println(" Num1 is Greater :" + Num1);
			} 
			else 
			{
				System.out.println(" Num3 is Greater :" + Num3);
			}
		} 
	    else 
	    {
	    	if (Num2>Num3) 
	    
	    	{
	    		System.out.println(" Num2 is Greater :" + Num2);
	    	}
	    	else
	    	{
	    		System.out.println(" Num3 is Greater :" + Num3);
	    	}
	    }
	}

}
