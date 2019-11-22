package basics;

import java.util.Scanner;

public class RintMethod 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Enter the Number");
		double num = sc.nextDouble();
		double num1 = sc.nextDouble();
		
		sc.close();
		
		System.out.println(Math.rint(num)+Math.rint(num1));
		

	}

}
