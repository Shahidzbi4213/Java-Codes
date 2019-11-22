/**
 1). If inner class is static then we do not to create the object of outer class.
 
 2). The object of static inner class is created as :
 			Outer.Inner object  = new Outer.Inner();
 */

package innerClassConcept;

class Out
{
	 void f1()
	{
		System.out.println("This is Blah.");
	}
	
	static class In extends Out
	{	
		
		void Demo()
		{
			System.out.println("This is Inner Class");
		}
	}
	
}

public class Example2 
{

	public static void main(String[] args) 
	{
		
		Out.In object1 = new Out.In();
		
		object1.Demo();
		object1.f1();
	    
		

	}

}
