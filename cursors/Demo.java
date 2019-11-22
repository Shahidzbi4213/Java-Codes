package cursors;

import java.util.*;

public class Demo 
{

	public static void main(String[] args) 
	{
		Vector<String> v= new Vector<String>();
		
		v.add("Apple");
		v.add("Samung");
		v.add("Oppo");
		v.add("OnePlus");
		
		ListIterator<String> it = v.listIterator();
		
		while(it.hasNext())
		{
			String s = it.next();
			
			if(s.equals("Oppo"))
			{
				it.set("Redmi");
			}
			else if(s.equals("Apple"))
			{
				it.remove();
			}
		}
		
		for(String obj : v)
			{
				System.out.println(obj);
			}
		
		
	}

}
