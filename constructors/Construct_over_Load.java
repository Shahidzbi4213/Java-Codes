package constructors;

public class Construct_over_Load 
{
	String	Name;
	int 	Age;
	String  Batch;
	String  Subject;
	
	//Constructor Overloading
	
	public Construct_over_Load(String n,int a)
	{
		Name=n;
		Age=a;
		
	}
	
	public Construct_over_Load(String b,String s)
	{
		Batch=b;
		Subject=s;
		
	}

	
}
