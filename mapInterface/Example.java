/**
 									"HashMap Class"
 
 1. Java HashMap class implements the map interface by using a hash table. 
 
 2. It inherits AbstractMap class and implements Map interface.
 
 3. Java HashMap class contains values based on the key.

 4. Java HashMap class contains only unique keys.
 
 5. Java HashMap class may have one null key and multiple null values.
 
 6. Java HashMap class is non synchronized.
 
 7. Java HashMap class maintains no order.
 
 8. The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 
 9. public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable  
 
 */

package mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Student
{
	String Name ;
	int RllNo;
	
	public Student(String name, int rllNo) 
	{
		Name = name;
		RllNo = rllNo;
	}

	public String getName() 
	{
		return Name;
	}

	public int getRllNo() 
	{
		return RllNo;
	}
	
	@Override
	public String toString() 
	{
		return RllNo+" "+Name;	
	}
		
}

 class Department
 {
	 String Dept;

	public Department(String dept) 
	{
		super();
		Dept = dept;
	}

	public String getDept() 
	{
		return Dept;
	}
	
	
	public String toString() 
	{
		return Dept;
	}
 }

public class Example 
{
	public static void main(String[] args) 
	{
			Student s1,s2,s3;
			Department d1,d2,d3;
			
			s1 = new Student("Ali",1);
			s2 = new Student("Khan",2);
			s3 = new Student("Sajid",3);
			
			d1	= new Department("Computer");
			d2	= new Department("Micro");
			d3	= new Department("English");
			
			Map<Student,Department> map = new HashMap<>();
			
			map.put(s1,d1);
			map.put(s2,d2);
			map.put(s3,d3);
	
			
			Set<Student> keys = map.keySet();
			
			for(Student key : keys)
			{
				System.out.println(key+" "+" "+map.get(key));
			} 
			
			
			
			
	}
			
			
			
}
