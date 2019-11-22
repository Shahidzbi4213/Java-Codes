package arrayList;

import java.util.ArrayList;

public class Methods 
{
	public static void main(String[] args) 
	{	
		int count = 0;
		ArrayList<String> li = new ArrayList<String>();
		ArrayList<String> arr = new ArrayList<String>();
		
		//Adding Elements
		li.add("ABC");
		arr.add("Ahmad");
		arr.add("Alpha");
		
		//Adding Elements Add different Index
		li.add(0,"BCD");
		
		//Adding Elements arr list to li list
		li.addAll(arr);
		
		//Adding Elements arr list to li list to different index
		li.addAll(0,arr);
		
		//Returns the element at the specified position in this list.
		System.out.println("Element is "+li.get(2));
		
		//Returns true if this list contains the specified element.
		System.out.println(li.contains("ABC"));
		
		//Returns the runtime class of this Object.
		System.out.println(li.getClass());
		
		//Returns true if this list contains no elements.
		System.out.println(li.isEmpty());
		
	  //Replaces the element at the specified position in this list with the specified element.
	  li.set(0,"XXX");
	 
	 //Returns the index of the first occurrence of the specified element in this list, 
	 //or -1 if this list does not contain the element.
	    System.out.println(li.indexOf("BCD"));
	    
	    //Removes the element at the specified position in this list.Shifts any subsequent
	    //elements to the left (subtracts one from their indices).
	     li.remove(3);
	     
	   //Removes from this list all of its elements that are contained in the specified collection.
	   li.removeAll(arr);
	   
	  //Returns the number of elements in this list.
	   System.out.println("Size is "+li.size());
	   
	   //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex,
	   //exclusive. (If fromIndex and toIndex are equal, the returned list is empty.)
	    System.out.println(li.subList(0, 2));
	   	
	 //Removes all of the elements from this list. The list will be empty after this call returns.
	 //     li.clear();
	    
		for(String obj : li)
		{
			System.out.println(count+" "+obj);
			count++;
		}
		

	}
}
