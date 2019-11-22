/**
 *When a class extends a class, which extends another class then this is called
 *Multilevel inheritance.For example class College_Student extends class Student 
 *And class Student extends class Person then this type of inheritance is 
 *known as multilevel inheritance.
 */

package inheritance;

public class Person    //Parent Class
{
	
	public String Name;
	public int Age;
	
	//Fun to set Value
	public void setName(String n)
	{
		Name=n;
	}
	
	public void SetAge(int age) 
	{
		Age=age;
	}
	
	//Fun to get values
	public String getName()
	{
		return(Name);
	}
	
	public int getAge()
	{
		return(Age);
	}
	
}
	