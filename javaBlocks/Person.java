/**
 * Block in java:
 * A block is just a collection of java Statments.
 * which is bundled in a single code pack with {} braces.
 * 
 * Instance Initialization Blocks :
 * In a Java program, operations can be performed on methods, constructors and initialization blocks.
 * Instance Initialization Blocks or IIB are used to initialize instance variables.
 * IIBs are executed before constructors. They run each time when object of the class is created.
 * Initialization blocks are executed whenever the class is initialized
 * and before constructors are invoked.
 * They are typically placed above the constructors within braces.
 */

package javaBlocks;

public class Person 
{

	private  int x;
	
	//Instance Block 1
	{
		System.out.println("Exmaple value is "+x);
		x=100;
		
	}
	
	//Constructor
	public Person()
	{
		System.out.println("Constructor value is "+x);
	}
	
	//Instance Block 2 
	{
		System.out.println("Exmaple value is "+200);
		
		
	}
	
	public static void main(String[] args) 
	{
		new Person();

	}

}
