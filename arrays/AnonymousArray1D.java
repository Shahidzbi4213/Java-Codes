/*
               					Anonymous Array
               					
 1). Sometimes we can create an array without name also , such type of nameless array
      is known as Anonymous Array .
      
 2). The main object of anonymous arrays is , it is created only for instant use.
 
 3). Anonymous array is passed as an argument of method.
 
 4). Anonymous array is created and initialized in the same line.
 
 */

package arrays;

public class AnonymousArray1D 
{
	 
	  static void Sum(int[]r)
	{ 
		int total=0;
		
		for(int i=0; i<r.length;i++)
		{
			 total=total+r[i]; 

        System.out.println(r[i]);
		}
		  System.out.println("Sum = "+total);
	
	}
	
	public static void main(String[] args) 
	{
		
		Sum(new int[] {10,20,30});

	}
	
	

}
