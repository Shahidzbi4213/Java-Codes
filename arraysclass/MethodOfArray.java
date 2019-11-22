package arraysclass;

import java.util.*;
public class MethodOfArray 
{

	public static void main(String[] args) 
	{
		int [] arr = {10,3,15,2,11};
		
		// for Sorting
		Arrays.sort(arr,2,5);
		
		//Arrays.fill(arr, 4);
		
		
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

}
