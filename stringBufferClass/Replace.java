package stringBufferClass;

public class Replace {

	public static void main(String[] args) 
	{
		StringBuffer sb =new StringBuffer("I am numan");
		
		sb.replace(5,10, "Shahid");
		
		System.out.println(sb);

	}

}
