package javaBlocks;

public class Demo_Static_2 
{
	//Constructor
	
	public Demo_Static_2()
	{
		System.out.println("Construtor Invoked");
	}
	
	//Static Method
	public static void Show()
	{
		System.out.println("Method Call");
	}
	
	//Static block
	static
	{
		System.out.println("Static Block Invoked");
	}
	
}
