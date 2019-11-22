package stringClass_Methods;

public class Method1 {

	public static void main(String[] args) 
	{
		 //index Methods
		   
		   String s1 = "Shahid Iqbal";
		   
		   /*
		    int indexOf(int ch)
            Returns the index within this string of the first occurrence of the specified character.
		    */
		   System.out.println(s1.indexOf("I"));
		   
		   /*
		    int indexOf(int ch, int fromIndex)
           Returns the index within this string of the first occurrence of the specified character,
              starting the search at the specified index.
		    */
		   System.out.println(s1.indexOf("l",7));
		   
		   System.out.println(s1.indexOf("qba", 5));
		   
		   System.out.println(s1.indexOf("Iqb"));
		   
		   System.out.println(s1.lastIndexOf("d"));
		   
		   System.out.println(s1.lastIndexOf("hid", 7));
		

	}

}
