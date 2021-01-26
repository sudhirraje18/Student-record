package Shiv;

import java.util.Scanner;

public class Area_Circle
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		double pi=3.14;
		double area;
		
		System.out.println(" Enter the Radius of Circle : ");
		double rad = sc.nextDouble();
		
		area= pi*rad*rad;
		
		System.out.println(" Area of Circle : "+area);
		sc.close();
	}

}
