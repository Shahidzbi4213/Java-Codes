/*
                             What is String?
                             
   1). Strings, which are widely used in Java programming, are a sequence of characters.
        In Java programming language, strings are treated as objects. 
        
   2). The Java String is immutable which means it cannot be changed. Whenever we 
        change any string, a new instance is created.
    
   3). There are two ways to create String object:
   
            a) String Sr ="Java"; (Literally)
            
            b) String Sr = new String("Java");  (new keyword)
 */


package stringClass_Methods;

public class  Example 
{

	public static void main(String[] args) 
	{
		//s1 and s2 points to the same object because the words are same in string
		String s1 = "Shahid";  
		String s2 = "Shahid";
		
		String s3 = "Iqbal";
		String s4 = "Shahid"+s3;
		
		String s5 = "ShahidIqbal";
		
		//s6 points to the new object because it is made with help of new keyword
		String s6 = new String("ShahidIqbal");
		
		//we are comparing the object of s1 and s2 which is equal. 
		System.out.println("Result1 = "+(s1==s2));
		
		System.out.println("Result2 = "+(s4==s5));
		
		//Here we are comparing Strings of s5 and s4 which is true
		System.out.println("Result3 = "+s5.equals(s4));
		
		System.out.println("Result4 = "+(s5==s6));
		
		System.out.println("Result5 = "+s6.equals(s5));
		
		


	}

}
