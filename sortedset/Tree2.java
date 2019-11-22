/**
 								NavigableSet in Java 
 
 1). NavigableSet represents a navigable set in Java Collection Framework. 
 
 2). It is a child interface of Sorted set interface.
 
 3). It provides methods to navigate the sorted  set.
 
 4). 
 5).
 */

package sortedset;

import java.util.*;

public class Tree2 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(3);
		t.add(1);
		t.add(4);
		t.add(2);
		t.add(5);
		t.add(9);
		
		/* Methods of Navigable set implemented by Tree set Class
		 * its is the child interface of Sorted set interface
		 */
		
		/* 1. Returns the least element in this set greater than or equal to the given element,
		 *    or null if there is no such element.
		 */
			System.out.println(t.ceiling(8));
		
		/* 2. Returns the greatest element in this set less than or equal to the given element,
		 *    or null if there is no such element.
		 */
			System.out.println("Value "+t.floor(8));
		
		/*3. Returns the greatest element in this set strictly less than the given element,
		 *    or null if there is no such element. 
		 */
		    System.out.println(t.lower(4));
		 
		/*4. Returns the least element in this set strictly greater than the given element,
		 *    or null if there is no such element.
		 */
			 System.out.println(t.higher(7));
		
	    /*5. Retrieves and removes the first (lowest) element,or returns null if this set is empty.
	     */
			 System.out.println("Deleted value is "+t.pollFirst());
	

	   /*5. Retrieves and removes the Last (Highest) element,or returns null if this set is empty.
	   */
		  System.out.println("Deleted value is "+t.pollLast());
		
		  
	}

}
