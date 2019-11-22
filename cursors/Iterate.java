/*
									"Iterator"

 1). Iterator is available for all collection implemented classes.
 
 2). All Collection interfaces provide a method called iterator().
 			public Iterator iterator();
 
 3). Iterator it = obj.iterator();
 
 4).						"Syntax"
 
	   		public interface
	   		{
	   		 boolean hasNext();
	   		 Object next();
	   		 void remove();
	   		 }

 5). You can only add or remove object from iteration at a time.
 
 6).  Not able to replace any element.
*/




package cursors;

import java.util.*;

public final class Iterate 
{

	public static void main(String[] args) 
	{
		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<=10; i++)
		{
			arr.add(i);
		}
		
		Iterator<Integer> itr = arr.iterator();
		
		while(itr.hasNext())
		{
			int i = itr.next();
			if(i>3 && i<7)
			itr.remove();	
		}
		
		for( int i : arr)
		{
			System.out.println(i);
		}
	}

}
