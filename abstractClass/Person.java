/**
 * Abstract Class:
 * 
 * 1).A class which is declared with the abstract keyword is known as an abstract class in Java.
 *      It can have abstract and non-abstract methods (method with the body).
 *      
 * 2).Abstraction is a process of hiding the implementation details and showing
 *             only functionality to the user.
 *             
 *             
 * 3).Another way, it shows only essential things to the user and hides the internal details.
 * 
 * 4).Abstraction lets you focus on what the object does instead of how it does it.
 * 
 */

/*
 * Ways to achieve Abstraction:
 * 
 * 1).Abstract class (0 to 100%)
 * 2).Interface (100%)
 */

/**
 * 1). A class which is declared as abstract is known as an abstract class.
 * 
 * 2). It can have abstract and non-abstract methods. It needs to be extended
 *      and its method implemented. It cannot be instantiated.
 *      
 * 3). Points to Remember:
 * 
 *      a). An abstract class must be declared with an abstract keyword.
 *      b). It can have abstract and non-abstract methods.
 *      c). It cannot be instantiated.(Can not create object of abstract class)
 *      d). It can have constructors and static methods also.
 *      e). It can have final methods which will force the subclass not to change the body of the method.
 */

/*
 * Abstract Method:
 * 
 * A method which is declared as abstract and does not have implementation
 *       is known as an abstract method.
 * 
 *       e-g   abstract void Show(some arguments);
 */




package abstractClass;

  abstract class Student 
{
	
	 int Age;
		 void Age(int Age)
		{
			 this.Age=Age;
			System.out.println(this.Age);
		}
}
 
 class Faculty extends Student
 {
	 void Name()
	 {
		 System.out.println("Shahid");
	 }
	 
 }

class Person extends Faculty
{
	public static void main(String []args)
	{	
		Faculty f=new Faculty();
		f.Age(21);
		f.Name();
		
	}
	
}
