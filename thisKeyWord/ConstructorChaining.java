/**
 * Constructor Chaining:
 * 
 * 1). Constructor can call the other constructor of super class with help of "super" keyword
 * 	   and sub class with the help of "this" keyword.
 * 
 * 2). Constructor call from a constructor must be the first step. (call should be appear in 1st line).
 * 
 * 3). Such Series of invocation of constructors is called Constructor Chaining.
 */

package thisKeyWord;

class A
{
	A()
	{
		int a,b;
		a=12;
		b=12;
		
		System.out.println("Sum = "+(a+b));
	}
}

class B extends A
{
	B()
	{
		this(12);  //its invoke the constructor of the same class e-g: B(int k)
		
		int x,y;
		x=100;
		y=75;
		
		System.out.println("Sub = "+(x-y));
	}
	
	B(int k)
	{		
		int m,n;
		m=100;
		n=75;
		
		System.out.println("Mul = "+(m*n));
		
	}
}


public class ConstructorChaining 
{

	public static void main(String[] args) 
	{
		
		new B();

	}

}
