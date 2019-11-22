package doublyLinkedList;

import java.util.InputMismatchException;

/*
 *  Java Program to Implement Doubly Linked List
 */
 
import java.util.Scanner;
 
/*  Class Node  */
class Node
{
    protected double data;
    protected Node next, prev;
 
    /* Constructor */
    public Node()
    {
        next = null;
        prev = null;
        data = 0;
    }
    /* Constructor */
    public Node(double val, Node n, Node p)
    {
        data = val;
        next = n;
        prev = p;
    }
    /* Function to set link to next node */
    public void setLinkNext(Node n)
    {
        next = n;
    }
    /* Function to set link to previous node */
    public void setLinkPrev(Node p)
    {
        prev = p;
    }    
    /* Function to get link to next node */
    public Node getLinkNext()
    {
        return next;
    }
    /* Function to get link to previous node */
    public Node getLinkPrev()
    {
        return prev;
    }
    /* Function to set data to node */
    public void setData(int d)
    {
        data = d;
    }
    /* Function to get data from node */
    public double getData()
    {
        return data;
    }
}
 
/* Class linkedList */
class linkedList
{
    protected Node start;
    protected Node end ;
    public int size;
 
    /* Constructor */
    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
   
    /* Function to insert element */
    public void insert(double val)
    {
        Node nptr = new Node(val, null, null);        
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            nptr.setLinkPrev(end);
            end.setLinkNext(nptr);
            end = nptr;
        }
        size++;
    }
   
    /* Function to display status of list */
    public void display()
    {
        System.out.print("  ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkNext() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        
        Node ptr = start;
        System.out.print(start.getData()+ "  ");
        ptr = start.getLinkNext();
        while (ptr.getLinkNext() != null)
        {
            System.out.print(ptr.getData()+ "  ");
            ptr = ptr.getLinkNext();
        }
        System.out.print(ptr.getData()+ "\n");
      
    }

 

/* Function to display status of list */
public void display1()
{
	 System.out.print("  ");
    if (size == 0) 
    {
        System.out.print("empty\n");
        return;
    }
    if (end.getLinkPrev() == null) 
    {
        System.out.println(end.getData() );
        return;
    }
    
    Node ptr = end;
    System.out.print(end.getData()+ "  ");
    ptr = end.getLinkPrev();
    while (ptr.getLinkPrev() != null)
    {
        System.out.print(ptr.getData()+ "  ");
        ptr = ptr.getLinkPrev();
    }
    System.out.print(ptr.getData()+ "\n");
  
}}

/* Class DoublyLinkedList */
public class DoublyLinkedList
{    
    public static void main(String[] args)
    {            
        Scanner scan = new Scanner(System.in);
        
        /* Creating object of linkedList */
        linkedList list = new linkedList(); 
        
        System.out.println("run:");
		System.out.println("exit -to end the loop");
        
        /*  Perform list operations  */
	       for(;;)
	       {
	        	try
	        	{
	        		
	        	System.out.println("Enter the Node");
		             list.insert( scan.nextDouble() );  
	        	} 
	        	catch (InputMismatchException e) 
	        	{
	        		System.out.println("Created DLL is :");
	        		
	        		System.out.print("Traversal in Forward Direction");
					list.display();
					
					System.out.println("");
					
					System.out.print("Traversal in Reversed Direction");
					list.display1();
					System.exit(0); 
					scan.close();
	        	}
	      	 }     
    }
}