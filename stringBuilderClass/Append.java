package stringBuilderClass;

public class Append 
{
	
	public static final void main(String[] args) 
	{
		StringBuilder sb =new StringBuilder("ABC");
		
		sb.append("D");
		int i = sb.codePointAt(2);
		
		sb.reverse();
		System.out.println(sb.substring(2));
		System.out.println(i);
		System.out.println(sb);

	}

}
