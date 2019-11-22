package mapInterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmap 
{

	public static void main(String[] args) 
	{
		//Java LinkedHashMap maintains insertion order.
		Map<Integer,String> map = new LinkedHashMap<>();
		
		map.put(3,"Java");
		map.put(5,"C#");
		map.put(1,"Python");
		
		 Set<Integer> keys = map.keySet();
		 
		for (Integer i : keys) 
		{
			System.out.println(i+" "+map.get(i));
		}	 
	}

}
