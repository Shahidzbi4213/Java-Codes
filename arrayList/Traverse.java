/**
 													"Collection Framework"
 													
 1). The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
 
 2). Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion,
     manipulation, and deletion.
     
 3). Java Collection framework provides many interfaces (Set, List, Queue, Dequeue).
 
 4). Java Collection provides many classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet). 
 
 5). A Collection represents a single unit of objects, i.e., a group.
 
 6). It provides ready made architecture.

 7). It represents a set of classes and interfaces.
 
 8). It is optional.
 
 9). The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:
 					a).Interfaces and its implementations, i.e., classes
 					b).Algorithm
 					
 10). The Iterable interface is the root interface for all the collection classes.
 
 11). The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface
      also implement the Iterable interface.
      
 12). Iterator<T> iterator()  
 
 13). The Collection interface is the interface which is implemented by all the classes in the collection framework.
      It declares the methods that every collection will have. In other words, we can say that the Collection interface
      builds the foundation on which the collection framework depends.
 
 
 										"List Interface"
 
 
 1). List interface is the child interface of Collection interface. It inhibits a list type data structure in
     which we can store the ordered collection of objects. It can have duplicate values.
 
 2). List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
 
 3). To instantiate the List interface, we must use :
 
 4). ArrayList <data-type>  list1=  new ArrayList();

 5). LinkedList <data-type> list2 = new LinkedList();  
 
 6). Vector    <data-type> 	list3 = new Vector();  
 
 7). Stack <data-type> 		list4 = new Stack();  
 
 */

package arrayList;

import java.util.*;
public class Traverse 
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
		
		//Normal in Array form
		System.out.println(li);
		
		//using for-loop
		for(int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i));
		}
		
		//Using Iterator
		Iterator<String> itr=li.iterator(); 
		
		while(itr.hasNext())
		{  
		  System.out.println(itr.next());
		}
		
	
	}

}
