package randomNumber;

import java.util.Random;
public class RNum 
{

	public static void main(String[] args) 
{
		Random r= new Random();
		
	int     num = r.nextInt(100);
	double num2 = r.nextDouble();
	float  num3 = r.nextFloat();
	boolean   b = r.nextBoolean();
	
	System.out.println("Value is "+num);
	System.out.println("Value is "+num2);
	System.out.println("Value is "+num3);
	System.out.println("Value is "+b);
	

	}

}
