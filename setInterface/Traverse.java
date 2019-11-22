/*
 								"Set Interface"
 
 1). Set is the child interface of collection interface in java.
  
 2). It was introduced in java version 1.2.
 
 3). Duplicates values are not allowed.
 
 4). Insertion order are not preserved.
 
 5). Set interface does new contain any new methods.
 
 								"Hashset"
 
 6). Its a class and implements the Set interface.
 
 7). It follow the HashTable data structure.
 
 8). If we add duplicate value add method will return false, mean duplication is not allowed.
 
 9). Insertion order is not preserved but objects is add according to hash code order.
 
 10). Null values are allowed.
 
 11). Provides efficient  Searching.
 
 12). Its default capacity is 16.
 
 13). When it full up to 75% its capacity got double.
 */
package setInterface;

import java.util.*;

public final class Traverse 
{

	public static void main(String[] args) 
	{
		HashSet<String> h = new HashSet<String>();
		
		h.add("A");		//It returns boolean type value
		h.add("B");
		h.add("C");
		
		if(h.add("D")==true)
		{
			System.out.println("ADDED");
		}
		else
		{
			System.out.println("Not");
		}
		
		Iterator<String> it = h.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

}
	

}
