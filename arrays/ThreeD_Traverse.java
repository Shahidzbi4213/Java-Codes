package arrays;

import java.util.Scanner;

public class ThreeD_Traverse 
{

	public static void main(String[] args) 
	{
		int[][][] arr = new int[3][4][3];
		
		Scanner sc =new Scanner(System.in);
		
		 
		for(int i =0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					 System.out.println("Enter Data at "+i+j+k);
					arr[i][j][k]=sc.nextInt();
				}
					
			}
		}
		
		
		for(int i =0; i<2; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					 System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
					
			}
	   }
		
		sc.close();
	}
	
	

}
