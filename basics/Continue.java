package basics;

public final class Continue 
{

	public static void main(String[] args) 
	{
		double res=0;
		for(int i=1; i<=10; i+=3)
		{
			if(i/2==0)
			{
				continue;
			}
			
			res=res+1;
		}
		
		System.out.println(res);

	}

}
