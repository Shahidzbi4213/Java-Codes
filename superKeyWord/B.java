/*
 * super can be used to invoke parent class method:
 * 
 * 1.The super keyword can also be used to invoke parent class method.
 * 2.It should be used if subclass contains the same method as parent class.
 * 3.In other words, it is used if method is overridden.
 */





package superKeyWord;

public class B extends A
{
	
	public void m1()
	{
	
		//it invoke parent class method to restrict the overriding
		super.m1();
		
		System.out.println("Child Class Method");
		
	}
	
}
	
	
