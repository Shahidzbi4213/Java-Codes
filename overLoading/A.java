/*
 * Method Overloading is a feature that allows a class to have more than one method having the 
 * same name, if their argument lists are different. It is similar to constructor overloading 
 * in Java that allows a class to have more than one constructor having different argument lists.
 * 
 * Let’s get back to the point, when I say argument list it means the parameters that a method has:
 * For example the argument list of a method add(int a, int b) having two parameters is different
 * from the argument list of the method add(int a, int b, int c) having three parameters.
 * 
 * Three ways to overload a method:
 * 
 * 1) Number of parameters:
 * 			add(int, int)
			add(int, int, int)
 *
 * 2)  Data type of parameters:
 * 			add(int, int)
			add(int, float)
 * 
 * 3)  Sequence of Data type of parameters:
 * 				add(int, float)
                add(float, int)
 */





package overLoading;

public class A 
{
	public static void Show(String Name,int Age)
	{
		System.out.println("Name of the person is : "+Name);
		System.out.println("Age of the person is : "+Age);
	}
	
	public static void Show(int marks)
	{
		System.out.println("Person Marks is : "+marks);
		
	}
}
