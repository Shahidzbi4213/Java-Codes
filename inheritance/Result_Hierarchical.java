package inheritance;

public class Result_Hierarchical 
{
	public static void main(String[] args )
	{
		Hierarchical h=new Hierarchical();
		Sub_Hierarchical sh=new Sub_Hierarchical();
		Sub2_Hierarchical sh2=new Sub2_Hierarchical();
		
		h.Name();
		sh.Age();
		sh2.Language();
	}

}
