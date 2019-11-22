package stringBuilderClass;

import java.util.Scanner;

public class Reverse
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		sc.close();
		
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb.reverse());
	}

}
