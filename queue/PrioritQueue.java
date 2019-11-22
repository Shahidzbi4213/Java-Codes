package queue;

import java.util.PriorityQueue;

public class PrioritQueue 
{

	public static void main(String[] args) 
	{
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		//Inserts the specified element into this priority queue.
		pq.offer("3 Apple");
		pq.offer("4 Zoo");
		pq.offer("1 Balloon");
		pq.offer("2 Vehicle");
		
		for(String i : pq)
		{
			System.out.println(i);
		}
		
		//Retrieves and removes the head of this queue,or returns null if this queue is empty.
		System.out.println("Deleted: "+pq.poll());
		
		//Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty.
		System.out.println("Top of Queue: "+pq.peek());
		
		/*  Retrieves and removes the head of this queue. This method differs from poll
		 *  only in that it throws an exception if this queue is empty. 
		 */
			System.out.println(pq.remove());

	}

}
