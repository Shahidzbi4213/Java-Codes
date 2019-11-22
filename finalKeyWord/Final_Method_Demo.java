package finalKeyWord;

public class Final_Method_Demo extends Final_Method
{
	//Cannot override the final method from Final_Method cuz overridden method is final
	void Show()
	{
		System.out.println("We are in child class");
	}

	public static void main(String[] args) 
	{
		
		Final_Method_Demo f1=new Final_Method_Demo();
		
		f1.Show();
	}

}
