package mathClass;

import java.util.Scanner;

public class Rint_Method 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Num");
		double num  = sc.nextDouble();
		sc.close();
		
		/*
		 Returns the double value that is closest in value to the argument and is equal
		   to a mathematical integer.
		 */
		System.out.println("Result : "+Math.rint(num));
	}

}
