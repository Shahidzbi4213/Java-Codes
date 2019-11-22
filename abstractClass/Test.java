package abstractClass;

 abstract class Vehicle
 {
	 String Color;
	 String Name;
	 int No_Of_Tyers;
	 
	 abstract void Qualities(String Color,String Name,int No_Of_Tyers);
	 
	
 }
 
 
  class Car extends Vehicle
 {
	 void Qualities(String Color,String Name,int No_Of_Tyers)
	  {
		  this.Color=Color;
		  this.Name=Name;
		  this.No_Of_Tyers=No_Of_Tyers;
	  }
	 
	 void Display()
	 {
		 
		 System.out.println(Color+" "+Name+" "+No_Of_Tyers);
	 }

	
 }


 class Bike extends Vehicle
 {
	 void Qualities(String Color,String Name,int No_Of_Tyers)
	  {
		  this.Color=Color;
		  this.Name=Name;
		  this.No_Of_Tyers=No_Of_Tyers;
	  }
	 
	 
	 void Display()
	 {
		 System.out.println(Color+" "+Name+" "+No_Of_Tyers);
	 }
}

public class Test 
{

	public static void main(String[] args) 
	{
			Bike b=new Bike();
			b.Qualities("Blue", "Honda", 2);
			b.Display();
			
			Car c=new Car();
			c.Qualities("Red", "Toyota", 4);		
			c.Display();
	}

}
