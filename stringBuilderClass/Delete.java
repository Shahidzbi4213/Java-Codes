package stringBuilderClass;

public class Delete 
{

	public static void main(String[] args) 
	{
		StringBuilder sb =new StringBuilder("1 2 3 4 5");
		
	    sb.delete(5,7);
	    
	    System.out.print(sb);

	}

}
