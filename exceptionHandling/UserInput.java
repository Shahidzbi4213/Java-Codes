package exceptionHandling;

import java.util.Scanner;

public class UserInput 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		 
		try
		{
			System.out.println("Enter the two numbers : ");
			int a= sc.nextInt();
			int b= sc.nextInt();
			sc.close();
			
			System.out.println(a/b);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception : "+e.getMessage());
		}

	}

}
