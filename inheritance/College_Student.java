package inheritance;

//inheriting the property of student class

public class College_Student extends Student   //Sub Class
{
	
	String College_Name;
	
	public void setCollege_Name(String cn) 
	{
		College_Name=cn;
	}
	
	public String getCollege_Name() 
	{
		return(College_Name);
	}
	
	
}
