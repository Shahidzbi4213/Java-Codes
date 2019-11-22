/*
 * 1.If you make any method as final, you cannot override it.
 * 2.Which means even though a sub class can call the final method
 *   of parent class without any issues but it cannot override it.
 */

package finalKeyWord;

public class Final_Method 
{
	//Remove the comment for proper program
	//final void Show()
	{
		System.out.println("We are in parent class");
	}

}
