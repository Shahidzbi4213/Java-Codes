/*
 							"ANONYMOUS INNER CLASS"
 
 1). Anonymous class in java are more accurately known as "Anonymous Inner class".
 
 2). There is no such thing as anonymous class without the "inner".
 
 3). They are defined inside another class.
 
 4). An Anonymous class is an inner class that is declared without using class Name.
 
 
 */

package anonymousClass;

class Alpha
{
	public void Show()
	{
		System.out.println("Hi");
	}
	
}
class Beta
{
	//We create the instance of sub class which is anonymous subclass .
	//This anonymous class is the sub class of Alpha class.
	Alpha a = new Alpha()
	
		//Anonymous class Start
			{
			
				//We override the parent class method
				public void Show()
				{
					System.out.println("Bye");
				}
				
			};//Anonymous class Finished
}

public class Example 
{

	public static void main(String[] args) 
	{
		
		Beta b=new Beta();
		
		b.a.Show();
	}

}
