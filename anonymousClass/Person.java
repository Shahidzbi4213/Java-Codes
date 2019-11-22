package anonymousClass;

interface Male
{
	String Sex = "Male";
	
	  void Gender();
}





public class Person 
{

	public static void main(String[] args) 
	{
		Male m = new Male()
		{
			public void Gender() 
			{
				System.out.println(Sex);
				
			}
			
		};
		
		m.Gender();
	}

}
