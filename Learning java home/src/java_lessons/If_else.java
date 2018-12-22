package java_lessons;

public class If_else extends Ab {

	public static void main(String[] args) {
		If_else obj= new If_else();
		obj.gay();
		obj.she();
		
		
	}
}
class Ab extends Bb
{
	public  void she()
	{
		System.out.println("A class");
	}
	
	public void gay()
	{
		System.out.println("A class");
	}
}

class Bb 
{
	public   void she()
	{
		System.out.println("B class");
	}
}
