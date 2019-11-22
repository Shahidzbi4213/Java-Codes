/*
   Interface :
  
  1). Interface definition begins with the the keyword interface.
 
  			interface Nameofinterface
  				{ 
    				body 
     			}
     			
   2). Interface just specify the method declaration and contain fields.
  
   3). Methods is of type "public" and fields or variables of type "public static final".
  
   4). we can not change the modifiers of methods and variables.
 
   5). A class can "implements"(keyword) interfaces/interface.
  
   6). Interface can be instantiated mean we can can create an object of interface.
   
   7). Interface can not have the constructor.
   
   8). If a class "implements" an interface and does not define all the methods of the
       interface, then its must be declared "abstract" and the methods definition should
       be provided by the subclass that "extends" the abstract class.
    
   9). Multiple extension are allowed when extending interfaces.An interface can "extends"
       none,one or more interfaces.
   
  10). You can not create an object of an interface but creation of object reference is possible.
  
  11). Object reference of interface can refer to any type of its subclass.
  
  12). Simple we can say that a interface is the collection of abstract methods.
  
  13). In Java 8th to 9th they said ,that we can create
  				a) default method with default keywords.
  				b)we can create static methods. 
  				c)we can create private methods.
 */


package interfaceInJava;

public interface Admission 
{
	int x=5;   //its type is public static final

	
	
	
	static  void Dept()			//its type is public 
	{
		System.out.println("Computer Science");
	}
	
	void Name();    //public methods A
	void Fee();
	void Age();
	
	default void Super()			//Default methods
	{
		System.out.println("Unversity of Swabi");
	}
	
	
}
