/**
 * Java supports a special block, called static block (also called static clause) which can be used for
 * static initializations of a class.This code inside static block is executed only once: 
 * the first time you make an object of that class or the first time you 
 * access a static member of that class (even if you never make an object of that class).
 * For example, check output of following Java program.
 * 
 * Is used to initialize the static data member.
 * It is executed before the main method at the time of classloading.
 * Static method can be called directly without a need of creating object of the class.
 */


package javaBlocks;

public class StaticDemo 
{
	static int x;
	
	static		//Static method
	{
		x=1234;
	System.out.println("Value of x is"+x);
		
	}
	
	public static void main(String []args)
	{
		
	}

}
