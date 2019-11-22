/**
 								SortedSet Interface
 
 1). SortedSet is an interface in collection framework.
  
 2). This interface extends Set and provides a total ordering of its elements. 
 
 3). Duplicates Values are not allowed.
 
 4). Its is a child interface of set interface.
 
 5). Elements are in sorting order.
 
 6). All the elements which are inserted into a sorted set must implement the Comparable interface.
 
 7). 
 */

package sortedset;

import java.util.*;
public class Tree 
{
	public static void main(String[] args) 
    {
		TreeSet<String> t = new TreeSet<String>();
		
		t.add("D");
		t.add("A");
		t.add("C");
		t.add("B");
		
		/**
		 * Methods of Sorted set interface implemented by TreeSet class
		 * Sorted set introduced 6 new methods
		 */
		
		//1. Returns the first (lowest) element currently in this set.
		System.out.println(t.first());
		
		//2. Returns the Last (Highest) element currently in this set.
		System.out.println(t.last());
		
		//3. Returns a view of the portion of this set whose elements strictly less than toElement.		
		System.out.println(t.headSet("C"));
		
		/*4. Returns a view of the portion of this set whose elements are greater
		     than or equal to fromElement*/
		System.out.println(t.tailSet("B"));
		
		/*5. Returns a view of the portion of this set whose elements range from fromElement,
		 *   inclusive, to toElement,exclusive. (If fromElement and toElement are equal, 
		 *   the returned set is empty.)
		 */
			System.out.println(t.subSet("A","C"));
			
		/*6. Returns a view of the portion of this set whose elements range from  Element,
		 *   inclusive, to toElement,exclusive. (If fromElement and toElement are equal, 
		 *   the returned set is empty.)
		 */
			System.out.println(t.comparator());
		
	Iterator<String> it = t.iterator();
	
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		
	}

}
