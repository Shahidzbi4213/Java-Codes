/**
 								"Cursors"
  
  1). Cursors are used to retrieve data from Collection object, one by one.
  
  2). There are the Cursors in java.
  			a).Enumeration
  			b).Iterator
  			c).ListIterator
  
  3). Cursors is an interface.
 */

/*
 							"Enumeration"
  
  1). Enumeration is an interface in java.
  
  2). It is introduced in version 1.0 of java, thus only available for legacy classes
      (Stack and Vector).
      
  3). An object that implements the Enumeration interface generates the series of elements,
  	  one by one.
  	  
  4). And the next elements is been called by using "nextElements()".
  
  			
  									"Syntax"
  			
  			public interface Enumeration<E>
  			{
  				boolean hasMoreElements();
  				E		 nextElements();
  			}

 */

package cursors;

import java.util.*;

public class Enumerate //Enumeration 
{

	public static void main(String[] args) 
	{
		Vector<String>  v = new Vector<String>();
		
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		
		//v.element creates the object of Enumeration interface which reference is passed to e1
		Enumeration<String> e1 = v.elements();
		
		//hasMoreElements returns boolean type value
		while(e1.hasMoreElements())
		{
			//nextElement return the value
			System.out.println(e1.nextElement());
		}

	}

}
