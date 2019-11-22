/**
 * 1).static variable and methods is used for memory management(Because its does not require object
 *       to call).
 *       
 * 2).With in  the class we can call the static method directly.(e-g: methodName();).
 * 
 * 3).Out side the class body or from another class we can call it by ( e-g: className.methodName();).
 *
 * 4).Static methods and variables belong to the class not to an object.
 * 
 * 5).A static methods can only access static data.
 * 
 * 6).A static methods can on call other static methods.
 * 
 * 7).A static method can not refer to any "this" or "super" keyword in anyway.
 * 
 * 8).A class C inherits from its direct super class  all concrete methods 
 *       (Both static and non static ) of super class.
 *       
 * 9).No methods in class C has the same signature.    
 * 
 * 10).Function Hiding : if super class and sub class have the same methods the sub class
 * 						 hides the super class methods.
 */





package staticMemberFunction;

class Parent
{
	  static void Display()
	  {
		  System.out.println("Display Method");
	  }
}

class Child extends Parent
{
	static void Display()
	{
		System.out.println("Child Method");
	}
}

public class Example
{

	public static void main(String[] args) 
	{
		Parent.Display();

	}

}
