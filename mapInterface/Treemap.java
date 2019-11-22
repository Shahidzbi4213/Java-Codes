
/**
 							"TreeMap"
 
 1. Java TreeMap class is a red-black tree based implementation. 
 
 2. It provides an efficient means of storing key-value pairs in sorted order.
 
 3. Java TreeMap contains values based on the key. It implements the NavigableMap interface
    and extends AbstractMap class.
    
 4. Java TreeMap contains only unique elements.
 
 5. Java TreeMap cannot have a null key but can have multiple null values.
 
 6. Java TreeMap is non synchronized.

 7. Java TreeMap maintains ascending order.
 
 8. public class TreeMap<K,V> extends AbstractMap<K,V> implements NavigableMap<K,V>, Cloneable, Serializable
 
 */




package mapInterface;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Treemap
{

	public static void main(String[] args) 
	{
		NavigableMap<Integer,String> map = new TreeMap<>();
		
		map.put(5,"Ahmad");
		map.put(1,"Sajid");
		map.put(9,"Kashif");
		map.put(2,"Mehad");
		map.put(0,"Nifad");
		
		Map<Integer, String> hm = map.descendingMap();
		Set<Integer>keys = hm.keySet();
		
		
		
		
		for(Integer i : keys)
		{
			System.out.println(i+" "+hm.get(i));
		}

	}

}
