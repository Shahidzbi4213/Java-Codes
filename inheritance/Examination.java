/**
 * 1.The extends keyword indicates that you are making a new class that derives from an existing class.
 * 2.The meaning of "extends" is to increase the functionality.
 * 3.In the terminology of Java, a class which is inherited is called a parent or superclass,
 * and the new class is called child or subclass. 
 */

package inheritance;

public class Examination 			//Single Inheritance 
{

	public static void main(String[] args) 
	{
		Sports_Car sc=new Sports_Car();
		
		sc.setName("Toyota");
		sc.setColor("Red");
		sc.setFuelType("Petrol");
		sc.setEngine("2500cc");
		sc.setSpeed("250km/h");
		sc.setGeneration("5th");
		
		System.out.println("Car Type is : "+sc.getName());
		System.out.println("Car Color is : "+sc.getColor());
		System.out.println("Car Fuel Type is : "+sc.getFuelType());
		System.out.println("Car Engine is : "+sc.getEngine());
		System.out.println("Car Speed is : "+sc.getSpeed());
		System.out.println("Car Generation is : "+sc.getGeneration());
		
	}
}

