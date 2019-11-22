package inheritance;

//Its inherit the property of super class person

public class Student extends Person   //Terminated sub class
{
	int Roll_No;
	
	public void setRoll_No(int r)
	{
		Roll_No=r;
	}
	
	public int getRoll_No()
	{
		return(Roll_No);
	}
	
	
}
