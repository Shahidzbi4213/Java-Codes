/*
 							Exception Handling
 
 1). Exceptions in java are any abnormal, unexpected events or extraordinary conditions
  	 that may occurs at runtime. 
 
 2). Four options are possible :
 			i).   Default throw and default catch
 			ii).  Default throw and our catch
 			iii). Our throw and default catch
 			iv).  Our throw and our catch
 
 
 3). Java exception handling is used to handle error condition in a program systematically
  	 by taking the necessary action. 
 
 4). Parent class of all exception is "Throwable", which further divided into sub-classes.
 
 5). Exception(subclass of throwable): Divided into three classes:
 			i).		RuntimeException
 			ii).	ClassNotFoundException
 			iii).	IOException
 
 6).RuntimeException(subclass of Exception class): is further divided into more sub classes:
 					i).		ArithmeticException
 					ii).	NullPointerException
 					iii).	IllegalArgumentException
 					iv).	NumberFormatException
 					v).		ArrayIndexOutOfBounds
 
 7). Java exceptions are raised with "throw" keyword and handled with "catch" block.
 
 8). Throwable class : Provides a String variable that can be set by the subclasses to provide
      a detail message that provides more information of the exception occurred.
 
 9). All classes of Throwable define a one parameter constructor that takes a string as the detail
     message.
 
 10). The class Throwable provides getMessage() function to retrieve an exception.
  
 */


package exceptionHandling;

public class Arithmetic
{

	public static void main(String[] args)
	{
		System.out.println(3/0);	
			
			
	}

}
