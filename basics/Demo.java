package basics;

import java.util.Scanner;

public class Demo 
{

	public static void main(String[] args) 
	{
		String name = "yes";
		String yourname = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		yourname = sc.nextLine();
		sc.close();
		
		if(yourname.equals(name))
		{
			System.out.println("Right");
		}
		
		else
		{
			System.out.println("Not Right");
		}
		
		
	}

}
