/*
 								"Inner Class"
 
 1). In java, just like Methods, Variables of class too can have another class as its member.
 
 2). The class written is called the nested class.
 
 3). The class that holds the inner class is called the outer class.
 
 4). There are two types of inner class :
 				i) Static Inner class
 				ii) Non Static Inner class
 
 5). Static inner class instance can be created outside the outer class with the following syntax :
 			    Outer.Inner object = new Outer.Inner();
 
 6). No need to create the instance of outer class.
 
 7). Inner class can be public, protected, private,default and static.
 
 8). Outer class can only be public or default.
 
 */

package innerClassConcept;

class Outter
{
	
	  public class Inner
	{
		public void Show()
		{
			System.out.println("ABC");
		}
	}
	
}


public class Example 
{

	public static void main(String[] args) 
	{
		Outter out = new Outter();
		
		Outter.Inner  obj = out.new Inner();
		
		obj.Show();
	}

}
