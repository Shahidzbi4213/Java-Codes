package arraysclass;

import java.util.*;
public class CollecntionsMethods 
{

	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(32);
		al.add(5);
		al.add(2);
		
		Collections.sort(al);
		int index = Collections.binarySearch(al, 10);
		//Collections.reverse(al);
		System.out.println("index of 10 is = "+index);
		
		Collections.replaceAll(al, 32, 11);
	
		for (Integer i : al) 
		{
			System.out.println(i);
			
		}
		
	}

}
