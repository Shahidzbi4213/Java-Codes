package inheritance;

public class Sports_Car extends Car      //Sub Class
{
	public String Speed;
	public String Generation;
	
	public void setSpeed(String s)
	{
		Speed=s;
		
	}
	
	public void setGeneration(String g)
	{
		Generation=g;
	}
	
	public String getSpeed()
	{
		return(Speed);
	}
	
	public String getGeneration()
	{
		return(Generation);
	}
}
