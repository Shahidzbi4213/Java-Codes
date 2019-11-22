package superKeyWord;

class Beta
{
	 int Age;
	 String Name;
	 
	 Beta(int Age,String Name)
	 {
		 this.Age=Age;
		 this.Name=Name;
				
	 }
}

class Gamma extends Beta
{
	String FName;
	Gamma(int Age,String Name,String FName)
	{
		super(Age,Name);  //reusing parent constructor  
		this.FName=FName;
	}
	
	public void Show()
	{
		System.out.println(Age+" "+Name+" "+FName);
	}
	
}

public class Alpha
{
	public static void main(String[]args)
	{
		Gamma g=new Gamma(21,"Shahid Iqbal","Noor Malik");
		g.Show();
	}
}















