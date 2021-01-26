package Shiv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class SumExp
{

	
	 int x , y ;
	public static void main(String[] args)
	{
		
		try
		{
			SumExp Obj= new SumExp();
			int sum;
			
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println(" Enter the Number ");
			System.out.println(" x =" + "");
			Obj.x=Integer.parseInt(br.readLine());
			
			System.out.println("y =" + "");
			Obj.y=Integer.parseInt(br.readLine());
			
			sum=Obj.x+Obj.y;
			
			System.out.println(" Sum is :"+sum);
		}
		
	
		catch (Exception e) 
		
		{
			System.out.println(e);
		}
		
	}

}
