/**			
 									"Map Interface"
 
 1. The java.util.Map interface represents a mapping between a key and a value.
 
 2. The Map interface is not a sub type of the Collection interface. 
 
 3. A map contains values on the basis of key, i.e. key and value pair.
 
 4. Each key and value pair is known as an entry. 
 
 5. A Map contains unique keys.
 
 6. A Map is useful if you have to search, update or delete elements on the basis of a key.

 7. There are two interfaces for implementing Map in java: Map and SortedMap, and three classes:
     HashMap, LinkedHashMap, and TreeMap.
 
 8. A Map doesn't allow duplicate keys, but you can have duplicate values.
  
 9. HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow
    any null key or value.
    
 10. HashMap is the implementation of Map, but it doesn't maintain any order.
 
 11. LinkedHashMap is the implementation of Map. It inherits HashMap class.
     It maintains insertion order.
     
 12. TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
 
 13. Map.Entry Interface
 
 14. Entry is the sub interface of Map. So we will be accessed it by Map.Entry name.
     It returns a collection-view of the map, whose elements are of this class.
     It provides methods to get key and value.
     
 */







package mapInterface;

import java.util.*;
public class Hashmap
{

	public static void main(String[] args)
	{
		 Map<Integer, String> hm = new HashMap<>();
		 
		 //	It is used to insert an entry in the map.
		 hm.put(1,"Shahid");
		 hm.put(2,"Aqsa");
		 hm.put(3,"Emaan");
		 hm.put(4,"Nifad");
		 
		 //It is used to delete an entry for the specified key.
		 hm.remove(3);
		 
		 
		for(Map.Entry<Integer, String> m : hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		 
		//It is used to reset the map.
		hm.clear();
		
		//Returns a Set view of the keys contained in this map   => keySet();
		Set<Integer> keys = hm.keySet();
		
		for(Integer i : keys)
		{
			System.out.println(i+" "+hm.get(i));
		}
		
	}
}