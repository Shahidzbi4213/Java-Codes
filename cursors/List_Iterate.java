/**
 										"ListIterate"
 										
  1). Java ListIterator interface is bi-directional iterator which is used to iterate over 
      the elements of list in either direction previous or next.
      
  2). We can obtain the reference to list iterator for any given list using list.listIterator()
      method call. Follow given ListIterator syntax.
      
      ListIterator<T> listIterator = list.listIterator();
      
  3). ListIterator is available since Java 1.2.
  
  4). ListIterator extends Iterator interface.
  
  5). ListIterator is applicable only for List implemented classes.
  
  6). Unlike Iterator, ListIterator supports all CRUD operations (CREATE, READ, UPDATE and DELETE)
      over a list of elements.
      
  7). Unlike Iterator, ListIterator is bi-directional. It supports both forward direction 
      and backward direction iterations.
      
  8). It has no current element; its cursor position always lies between the element that 
      would be returned by a call to previous() and the element that would be returned by
      a call to next().
      
      					
      					"Methods"
      
  9). void add(Object o) : Inserts the specified element into the list (optional operation).
  
  10). boolean hasNext() : Returns true if this list iterator has more elements when traversing
       the list in the forward direction.
  
  11). boolean hasPrevious() : Returns true if this list iterator has more elements when traversing
       the list in the reverse direction.
       
  12). Object next() : Returns the next element in the list and advances the cursor position.
  
  13). int nextIndex() : Returns the index of the element that would be returned by a subsequent
       call to next().
       
  14). Object previous() : Returns the previous element in the list and moves the cursor 
       position backwards.
       
  15). int previousIndex() : Returns the index of the element that would be returned by a subsequent 
       call to previous().
  
  16). void remove() : Removes from the list the last element that was returned by next() 
       or previous() (optional operation).
       
  17). void set(Object o) : Replaces the last element returned by next() or previous() with
       the specified element (optional operation).
 */


package cursors;

import java.util.*;

public final class List_Iterate 
{

	public static void main(String[] args) 
	{
		List<Integer> ll = new LinkedList<Integer>();
		
		for(int i=0; i<=10; i++)
		{
			ll.add(i);
		}
		
		//Traverse in Forward
		
		ListIterator<Integer> itr = ll.listIterator();
		
		while(itr.hasNext())
		{
			
			System.out.println("Data is "+itr.next());
		}

	}

}
