/**
 										  		"ArrayList"
 										  		
 1). Java ArrayList class uses a dynamic array for storing the elements.
 
 2). It inherits AbstractList class and implements List interface.
 
 3). Java ArrayList class can contain duplicate elements.
 
 4). Java ArrayList class maintains insertion order.
 
 5). Java ArrayList class is non synchronized.
 
 6). Java ArrayList allows random access because array works at the index basis.
 
 7). In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur if any element 
     is removed from the array list.
 
 8). ArrayList class declaration
 		public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Clone able, Serializable  
 
 */




package arrayList;

import java.util.ArrayList;

public class Traverse1 
{
	
	public static void main(String[] args) 
	{
		ArrayList<String> li = new ArrayList<String>();
		
		li.add("Shahid");
		li.add("Umer");
		li.add("Ahmad");
		
		//ArrayList traverse using For-Each Loop
		for(String obj:li)
		{
			System.out.println(obj);
		}
}}