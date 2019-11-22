/**
 							"LinkedList"
 
 1). Java LinkedList class uses a doubly linked list to store the elements.
     It provides a linked-list data structure. It inherits the AbstractList 
     class and implements List and Deque interfaces.
     
 2). Java LinkedList class can contain duplicate elements.
 
 3). Java LinkedList class maintains insertion order. 
 
 4). Java LinkedList class is non synchronized.
 
 5). In Java LinkedList class, manipulation is fast because no shifting needs to occur.
 
 6). Java LinkedList class can be used as a list, stack or queue.
 
 7). Let's see the declaration for java.util.LinkedList class.
 	 public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>,
 	 Cloneable, Serializable.
      
 */

package linkedList;

import java.util.*;
public class Traverse 
{
	public static void main(String[] args) 
	{
		LinkedList<String> li = new LinkedList<String>();
		
		
		//ADD the element to the first Node
	    li.addFirst("SHAHID");
		
		//Add the element to the Node
		li.add("A");
		
		//Add Element to the last Node
		li.addLast("Iqbal");
		
		
		
	//Retrieves and removes the first element of this list,or returns null if this list is empty.
		li.pollFirst();
		
		Iterator<String> it = li.descendingIterator();
		 while(it.hasNext())
		 {
			 //Returns the next element in the iteration.
			System.out.println(it.next());
		 }
		
		
	}

}
