package javaBlocks;

public class B extends A
{
	{
		System.out.println("B");
	}
	
	public B()
	{
		//super() can be used to invoke immediate parent class constructor.
		super();
		System.out.println("Constructor 2nd");	
		
	}
	
	
}
