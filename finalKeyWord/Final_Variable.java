/**
 * 1).The final keyword in java is used to restrict the user.
 * 2).The java final keyword can be used in many context. 
 * 3).Final can be:
				variable
				method
				class 
*/

/*
 * Java final variable:
 * 1.If you make any variable as final, you cannot change the value of final variable
 * (It will be constant).
 * 
 * 2.The final keyword can be applied with the variables, a final variable that have 
 * no value it is called blank final variable or uninitialized final variable
 * 
 * 3. It can be initialized in the constructor,directly or in intialization block.
 * 
 * 4. The blank final variable can be static also which will be initialized in 
 * the static block or directly.
 */



package finalKeyWord;

public class Final_Variable 
{
	//Static variable;
	static  final   double x;
	 static 
	 {
		 x=21.00;
	 }

	public static void main(String[] args) 
	{
		
		final double pi =3.14;
		
  /* 40.The final local variable pi cannot be assigned. 
   It must be blank and not using a compound assignment.*/
		//pi=pi+1;
		
		System.out.println(x);
		System.out.println(pi);

}}
