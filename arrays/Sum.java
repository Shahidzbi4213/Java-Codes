package arrays;

import java.util.Scanner;

public class Sum 
{

	public static void main(String[] args) 
	{
		int sum = 0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Array Length");
		int n=sc.nextInt();
				
	    int [] la=new int[n];
	    
	    for(int i=0;i<la.length;i++)
	    {
	    	System.out.println("Enter the Data to array");
	    	la[i]=sc.nextInt();
	    	
	    	 sum+=la[i];
	    	
	    	 
	    }
		
	    	System.out.println("Sum of the Elements is :"+sum);
	    	sc.close();
	}
		
}
