/**
 * OverRiding in java :
 * 
 * If subclass (child class) has the same method as declared in the parent class,
 * it is known as method overriding in Java.
 * 
 * Declaring a method in sub class which is already present in parent class is known
 * as method overriding. Overriding is done so that a child class can give its own 
 * implementation to a method which is already provided by the parent class.
 * In this case the method in parent class is called overridden method and the method
 * in child class is called overriding method.
 * 
 * The main advantage of method overriding is that the class can give its own specific
 * implementation to a inherited method without even modifying the parent class code.
 * 
 * The super keyword is used for calling the parent class method/constructor. 
 * super.myMethod() calls the myMethod() method of base class while super() calls 
 * the constructor of base class. Let’s see the use of super in method Overriding.
 */

 /*Rules for Java Method Overriding:
  * 
  * 1)The method must have the same name as in the parent class
  * 2)The method must have the same parameter as in the parent class.
  * 3)There must be an IS-A relationship (inheritance).
  * 
  * 
  */



package overRiding;

public class A 
{
	public int  Show(int x)
	{
		return x+10;
		
	}

}
