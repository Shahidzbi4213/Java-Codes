/*
  							Checked Exception

1). Checked Exception are CompileTimeException and its all descended/related sub classes.

2). Checked Exception forces the programmer to deal with the exception that may be thrown.

3). IOException,ClassNotFoundException,SQLException etc are the checked Exceptions.

4). "Checked" means that they will be checked at compile time itself.

5). A "throws" clause can be used in method prototype.

6). Method() throw <Exception>

7). A throws keyword in java is applicable to a method to indicate that the method raises
    particular type of exception while being processed.

8). The "throws" keyword in java take arguments as a list of the objects of type
     java.lang.throwables class. 

*/




package exceptionHandling;

import java.io.IOException;

public class Checked
{

	public static void main(String[] args) throws IOException
	{
		try
		{
		throw new IOException("Error !!!");
		}
		
		catch(IOException e)
		{
			System.out.println("Exception :" +e.getMessage());
		}
	}

}
