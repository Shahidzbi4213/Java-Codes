package constructors;

class A
{
	int a;
	A(int x)
	{
		
		a=x;
		
		System.out.println("Hello Sir "+(a*x));
	}
	
}
class B extends A
{
	B()
	{ 
		super(13);
		System.out.println("Hello Sir");
	}
}






public class Constructor {

	public static void main(String[] args) 
	{
		new B();
		

	}

}
