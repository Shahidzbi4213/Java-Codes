package stack;

import java.util.*;

public class Traverse 
{

	public static void main(String[] args) 
	{
		Stack<String> st = new Stack<String>();
		
		st.push("A");
		st.push("B");
		st.push("C");
		
		
		System.out.println("peek is "+st.peek());
		System.out.println(st.pop());
		
		Iterator<String> itr=st.iterator(); 
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
