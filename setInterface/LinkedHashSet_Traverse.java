/*
 * Its is same as hashset only insertion order is preserved.
 
 * It follows the HashTable and Doubly LinkedList Data Structure.
 */

package setInterface;

import java.util.*;

public final class LinkedHashSet_Traverse 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Double> hl = new LinkedHashSet<Double>();
		
		hl.add(21.0);
		hl.add(22.0);
		hl.add(32.0);
		hl.add(12.0);
		
		//Duplication is not allowed
		if(hl.add(24.0)==true)
		{
			System.out.println("ELement is Added");
		}
		else
		{
			System.out.println("Duplication is Not Allowed X");
		}
		
		
		
		for(Double obj : hl)
		{
			System.out.println(obj);
		}
	}

}
