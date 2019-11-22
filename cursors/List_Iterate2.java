package cursors;

import java.util.*;

class List_Iterate2
{
	public static void main(String[] args) 
	{
		
		List<String> l = new LinkedList<String>();
		
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		
		ListIterator<String> itr = l.listIterator();
		
		System.out.println("Forward");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Backward");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		
	}
}