package Shiv;

import java.util.Scanner;

public class PrimNumbr 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int flag=0;
		
	System.out.println("Enter the Number : ");
	int num=sc.nextInt();
	sc.close();
	
	for (int i = 2; i <= (num-1); i++)
	{
		if (num % i == 0)
		{
			System.out.println(num+ " is not Prime Number");
			 flag=1;
			break;	
		}
		
	
		if(flag == 0)
		{
			System.out.println(num+ "is Number Prime ");
		}
		
	}

	}

}
