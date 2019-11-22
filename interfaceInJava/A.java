package interfaceInJava;

 interface B
{
	void Show();

}
 class A implements B
 {
	public void Show()
	 {
		 System.out.println("I am FLah FLah!!");
		 
	 }
public static void main(String[]args)
{
	B b =new A();
	b.Show();
}
	
 }
