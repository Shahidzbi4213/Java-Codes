package staticMemberFunction;

class Demo
{
	int i=12;
	
	static void Display()
	{
		//Cannot make a static reference to the non-static field i
		
			System.out.println(/* i*/); //Remove the comment for proper program
	}
}

class XYZ
{
	 void Show()			//Non-Static Method
	{
		System.out.println("Hello Instance Method");
	}
	
	  static void Print()
	  {
		 //Cannot make a static reference to the non-static method Show() from the type XYZ
		  
		 //Show();
	  }
	
}










public class StaticMethodsCalls {

	public static void main(String[] args) 
	{
			Demo.Display();
			
			XYZ x=new XYZ();
		     x.Show();


	}

}
