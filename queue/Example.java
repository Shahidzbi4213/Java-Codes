package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Employe
{
	String Name;
	int Salary;
	
	public Employe(String name, int salary) 
	{
		
		Name = name;
		Salary = salary;
	}

	public String getName() 
	{
		return Name;
	}

	public int getSalary() 
	{
		return Salary;
	}
	
	
	public String toString()
	{
		return  Name + " => "+ Salary ;
		
	}
}

class Comparison implements Comparator<Employe>
{
	public int compare(Employe o1, Employe o2) 
	{
		Employe ee1,ee2;
		ee1 = o1;
		ee2 = o2;
		
      if(ee1.getSalary()>ee2.getSalary()) { return 1;}
      else { return -1;}
      
		//return ee1.getName().compareTo(ee2.getName());
	}
	
}

public class Example 
{

	public static void main(String[] args)
	{
		Employe e1,e2,e3,e4;
		
		e1 = new Employe("Ahmad",  1);
		e2= new Employe("Dawood",  3);
		e3 = new Employe("Salman", 4);
		e4 = new Employe("Emaan",   2);
		
      PriorityQueue<Employe> pq = new PriorityQueue<Employe>(new Comparison());
      
      pq.offer(e1);
      pq.offer(e2);
      pq.offer(e3);
      pq.offer(e4);
      
	     while(pq.size()!=0)
	     {
	    	 System.out.println(pq.remove());
	     }

	}
}
