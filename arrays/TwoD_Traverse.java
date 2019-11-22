/*
 								Java Array
 								
  1). Array is a collection of similar type of elements which have a contiguous memory location.

  2). Java array is an object which contains elements of a similar data type.
  
  3). It is a data structure where we store similar elements.
  
  4). We can store only a fixed set of elements in a Java array.
  
  5). Array in Java is index-based, the first element of the array is stored at the 0th index,
   	  2nd element is stored on 1st index and so on.
  
  6). Syntax to Declare an Array in Java:
   			dataType[] arr = new dataType[];
   			dataType arr [] = new dataType[];
 
 */

package arrays;

import java.util.Scanner;

public class TwoD_Traverse 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the No of Rows");
		int rows=sc.nextInt();
		
		System.out.println("Enter the No of Columns");
		int columns=sc.nextInt();
		
		
		int [][] arr =new int[rows][columns];
		
		for(int r=0; r<rows; r++)
		{
			for(int c=0; c<columns; c++)
			{
		System.out.println("Enter the Data to Array at index "+r+"-"+c);
			arr[r][c]=sc.nextInt();
			
			
		}}
		sc.close();
		
		
		for(int a=0; a<rows; a++)
		{
			for(int b=0; b<columns; b++)
			System.out.println("The Array Data is "+arr[a][b]);
		}
	}}
