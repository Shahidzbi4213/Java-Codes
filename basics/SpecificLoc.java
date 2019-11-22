package basics;

import java.util.Scanner;	

class Node
{
	
	public Node next;
	public int data;
}

class linklist 
	{
		Node start;
	}
public class SpecificLoc
{
	int data=0;
    Node next=null;  
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		
    //Creating an object of Linkedlist class
		linklist a= new linklist(); 
		
		Node n1=new Node();
		Node n2=new Node();
		Node n3=new Node();
		Node n4=new Node();

		n1.data=12;
		n2.data=13;
		n3.data=14;
		n4.data=15;

		a.start=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=null;

		Node ptr;
	    ptr=a.start;
		int counter=1;
		
		System.out.println("Before insertion ");
		while(ptr!=null) 		//Traversal of linkedList
		{
			System.out.println("\t Data: "+ptr.data);
			System.out.println("\t Location: "+counter+"\n");
			counter++;
			ptr=ptr.next;

		}

  try
  {  
	System.out.print("\t Enter location you want to insert a value: ");
	int loc= sc.nextInt();

	System.out.print("\t Enter the value: ");
	int value= sc.nextInt();

	Node n= new Node(); 	// creation of new Node
	n.data= value;	// assigning value to new Node
	ptr=a.start;
	counter=1;

	// Code to insert a Node at specific location is here
		if(loc==1)
		{
			a.start=n;
			n.next=n1;
			
		}
		else
		{
		while (counter<loc-1)
		{
			ptr=ptr.next;
			counter++;   
		}

		 n.next=ptr.next;
		   ptr.next=n;
}}

catch(ArithmeticException e)
{
  System.out.println("Invalid position:");
}

		System.out.println("After insertion : ");
		ptr=a.start;
		counter=1;
		 while(ptr!=null)
		{
			System.out.println("\t Data: "+ptr.data);
			System.out.println("\t Location: "+counter+"\n");
			
			ptr=ptr.next;
			counter++;
		}
	sc.close();
	}
}