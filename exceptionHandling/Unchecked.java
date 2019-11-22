/*
  						Types Of Exception
  	
1). There are two types of exception in java :
 			i).		Unchecked Exception	(RunTimeException)
 			ii).	Checked Exception	(CompileTimeException)

2). Unchecked Exception are RunTimeException and its all descended/related sub classes.

3). ArrayIndexOutOfBound,Arithmetic and so on are all the subclasses of the java.lang.
    RunTimeException class, which is a sub class of Exception class.

4). For each try block there can be 0 or more catch blocks, but only one finally block.

5). The catch and finally block must always appear in conjunction with try block.

6). A try block must be followed by either at least one catch block or one finally block.

7). The order of exception handlers in the catch block must be from the most specific exception.

8). The code in the finally block will always run whether the exception arise or not.


*/


package exceptionHandling;

 public class Unchecked
{

	public static void main(String[] args) 
	{
		
	   try 
	   {		
		System.out.println(3/0);
	   } 
	   
		catch (ArithmeticException e) 
	   {
		System.out.println(e.getMessage());
	   }
	   
	  finally
		{
			System.out.println("ABC");
		}
		
		

	}

}
