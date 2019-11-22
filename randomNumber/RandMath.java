package randomNumber;

import java.util.Random;

public class RandMath {

	public static void main(String[] args) 
	{
		
		 double num = Math.random();
			System.out.println(num);
					
		Random r = new Random();		
		System.out.println(r.nextInt(5)%10);

	}

}
