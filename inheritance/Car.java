/**
 * Inheritance in Java is a mechanism in which one object acquires 
 * all the properties and behaviors of a parent object.
 * It is an important part of OOPs (Object Oriented programming system).
 * Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
 */

/**
 * Terms used in Inheritance :'
 * 1.Class: A class is a group of objects which have common properties.
 * It is a template or blueprint from which objects are created. 
 * 
 * 2.Sub Class/Child Class: Subclass is a class which inherits the other class.
 * It is also called a derived class, extended class, or child class.
 * 
 * 3.Super Class/Parent Class: Superclass is the class from where a subclass inherits the features.
 * It is also called a base class or a parent class.
 * 
 * 4.Reusability: As the name specifies, reusability is a mechanism which facilitates you 
 * to reuse the fields and methods of the existing class when you create a new class.
 * You can use the same fields and methods already defined in the previous class. 
 */

package inheritance;

public class Car 		//Super Class
{
	public String Name;
	public String Color;
	public String FuelType;
	public String Engine;
	
	//set the properties
	 
	public void setName(String Name)
	{
		this.Name=Name;
	}
	
	public void setColor(String c)
	{
		Color=c;
	}

	public void setFuelType(String f)
	{
		FuelType=f;
	}

	public void setEngine(String e)
	{
		Engine=e;
	}
	
	//Get The Properties
	public String getName()
	{
		return(Name);
	}
	
	public String getColor()
	{
		return(Color);
	}
	
	public String getFuelType()
	{
		return(FuelType);
	}
	
	public String getEngine()
	{
		return(Engine);
	}

}
