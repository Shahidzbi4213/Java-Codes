package stringBufferClass;

public class Delete {

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("This is Java Program");
		StringBuffer sb1 = new StringBuffer("This is Java Program");
		
		System.out.println(sb1.delete(5, 18));
		System.out.println(sb.deleteCharAt(13));

	}

}
