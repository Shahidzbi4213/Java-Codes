package arrays;

import java.util.Scanner;

public class MatrixMultiplication 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int sum=0,
		rows1,rows2,
		columns1,columns2,
		 r,c;
		
		
		System.out.println("Enter the number of rows and columns to the first matrix");
		 rows1=sc.nextInt();
		 columns1=sc.nextInt();
		
		int[][] first=new int [rows1][columns1];
		
		
		System.out.println("Enter the Data to Array");
		for(r=0; r<rows1; r++)
		{
			for( c=0; c<columns1; c++)
			{
		
				first[r][c]=sc.nextInt();
			}
		}	
		
		System.out.println("Enter the number of rows and columns to the Second matrix");
		 rows2=sc.nextInt();
		 columns2=sc.nextInt();
		
 //Matrix Rule: The multiplication is only possible when first matrix rows is equal to second matrix columns. 
		if(rows1!=columns2)
		{
			System.out.println("Multiplication is not possible.....");
		}
		else
		{
			int [][] second =new int [rows2][columns2];
			
			//The resultant array after the multiplication
			int [][] multiply=new int[rows1][columns2];
			
			System.out.println("Enter the Data to Array");
			for(r=0; r<rows2; r++)
			{
				for(c=0; c<columns2; c++)
				{
				     second[r][c]=sc.nextInt();
					
				}
			}
			
			System.out.println("Product of the Matrices is :");
			
			for( r=0; r<rows1; r++)
			{
				for( c=0; c<columns2; c++)
				{
					//this k loop is for iteration of columns in first and rows in 2nd
				    for(int k=0; k<columns1; k++)
				    {
				  //first[r][k] = k is changing the columns and second[k][j]=k is changing the rows
				    	sum = sum + first[r][k]*second[k][c];
				    }
				    
				    //Assign the values of sum to array
				    multiply[r][c]=sum;
				    
				  //we make the sum zero , because we don't want the same sum for all
				    sum=0; 
					
				}
			}
			
			//printing the matrix
			
			for(r=0; r<rows1; r++ )
			{
				for( c=0; c<columns2; c++)
				{
					System.out.print(multiply[r][c]+"\t");
				}
				
				System.out.println();
			}
			
		 }
sc.close();
}}
