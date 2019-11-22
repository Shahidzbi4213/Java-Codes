package exceptionHandling;

public class ArrayIndex 
{

	public static void main(String[] args) 
	{
		int [] arr = new int[5];
		arr[0]=98;
		
		try 
		   {
			   
			   arr[6]=12;
			   
		   }
		   
		   catch(ArrayIndexOutOfBoundsException e)
		   {
			   System.out.println("Exception : "+e.getMessage());
		   }
		
		finally
		{
			System.out.println(arr.length);
			System.out.println(arr[0]);
		}
	}

}
