package basics;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		double facto = 1.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		long num = sc.nextLong();
		
		for(long i=num; i>0; i--)
		{
			facto = facto*i;
			
		}
		sc.close();
		
		System.out.println("Result is  "+facto);
		
		
		
		
	}

}
