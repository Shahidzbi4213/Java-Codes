package inheritance;
import java.util.Scanner;

public class Result 
{

	public static void main(String[] args) 
	{	
		Scanner sc =new Scanner(System.in);
		
		//Creating object of College_Student class to get access
		College_Student cs=new College_Student();
	
		System.out.println("Enter the Name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter the University Name : ");
		String CollegeName=sc.nextLine();
		
		System.out.println("Enter the Age : ");
		int age=sc.nextInt();
		
		System.out.println("Enter the Roll No : ");
		int rollno =sc.nextInt();
		
		sc.close();				//Closing the Scanner work
		
		//it will get value that user give
		cs.setName(name);
		cs.setCollege_Name(CollegeName);
		cs.SetAge(age);
		cs.setRoll_No(rollno);
		
		//Printing the values
		System.out.println("The Student Name is : "+cs.getName());
		System.out.println("The Student Age is : "+cs.getAge());
		System.out.println("The Student University Name is : "+cs.getCollege_Name());
		System.out.println("The Student Roll No is : "+cs.getRoll_No());
		
}}
