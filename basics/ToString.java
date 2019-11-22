package basics;

import java.util.Scanner;
public final class ToString 
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Num");
		int num = sc.nextInt();
		
		System.out.println("Converted Num is "+Integer.toBinaryString(num));
		sc.close();
 
	}

}
