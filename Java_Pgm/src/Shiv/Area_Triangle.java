package Shiv;

import java.util.Scanner;

public class Area_Triangle
{

	public static void main(String[] args)
	{
		double height ,base ,area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the Height and Base of Tringle : ");
		height= sc.nextDouble();
		base = sc.nextDouble();
		
		area= 0.5*height*base;
		
		System.out.println(" Area of Triangle : "+area);
		sc.close();
	}

}

