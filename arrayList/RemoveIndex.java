package arrayList;

import java.util.*;

public class RemoveIndex 
{

	public static void main(String[] args) 
	{
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(11);
		al.add(22);
		al.add(33);
		
		al.remove(1); //removes value from index 1
		
		System.out.println(al);
	}

}
