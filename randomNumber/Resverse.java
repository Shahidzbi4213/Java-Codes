package randomNumber;

import java.util.Scanner;

public final class Resverse 
{

	public static void main(String[] args) 
	{
		int rem,rev =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		sc.close();
		while(num!=0)
		{
			
			//reminder
			rem = num%10;
			
			//reversing
			rev= rev*10+rem; 
			
			//Quotient
			num = num/10;
		}
		System.out.println(rev);
	
	}

}
