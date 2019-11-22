package exceptionHandling;

import java.util.Scanner;

public class ImplicitThrow 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		sc.close();
		
		//our throw and our catch
		try
		{
			if(age>18)
			{
				System.out.println("Your are Qualified");
			}
			else
			{
				throw new ArithmeticException("You are not Eliggible");
			}
			
		}

		catch(ArithmeticException e)
		{
			System.out.println("Exception : "+e.getMessage());
		}
		
		finally	
		{
			System.out.println("Continue");
		}
		
		
	}

}
