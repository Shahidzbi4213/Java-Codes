package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Methods {

	public static void main(String[] args) 
	{
		ArrayList<Integer> li = new ArrayList<Integer>();
		ArrayList<String> al = new ArrayList<String>();
		
		
		
		li.add(1);
		li.add(95);
		li.add(28);
		li.add(18);
		li.add(78);
		li.add(108);
		
		al.add("Name");
		al.add("Khan");
		al.add("Ali");
		
		Collections.sort(li);
		Collections.sort(al);
		
		Iterator<Integer> it = li.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(String str : al)
		{
			System.out.println(str);
		}

	}

}
