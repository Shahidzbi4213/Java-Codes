package interfaceInJava;

class Students implements Admission,Result
{
	public void Name()
	{ 
		
		System.out.println("My Name is Shahid Iqbal.");
	}
	
	public void Age()
	{
		System.out.println("Age is 21.");
	}
	
	public void Fee()
	{
		System.out.println("Fee is 21000.");
	}
	
	public void Marks()
	{
		System.out.println("Marks is 864.");
	}
	
	public void Grade()
	{
		System.out.println("A1");
	}
	
}

public class University {

	public static void main(String[] args) 
	{
		Students s = new Students();
		
		s.Name();
		s.Age();
		s.Fee();
		s.Marks();
		s.Grade();
		s.Super();
		Admission .Dept();
	
	}

}
