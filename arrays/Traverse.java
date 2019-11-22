package arrays;

import java.util.Scanner;

public final class Traverse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array length");
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the data :"+i);
			arr[i]=sc.nextInt();
		}
		
		for(int a:arr)
		{
			System.out.println("The array data is :"+a);
		}
		
		sc.close();
	}

}
