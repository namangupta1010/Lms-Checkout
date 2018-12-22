package java_lessons;

public class Abstraction extends Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction obj=new Abstraction();
		obj.circle();
		obj.rectangle();
		
		
		Shape obj1= new Abstraction();
		obj1.circle();
		obj1.rectangle();

	}

	@Override
	public void circle() {
System.out.println("Circle abstraction method");		
	}

	@Override
	public void sqaure() {
		// TODO Auto-generated method stub
		
	}

}

class d extends Abstraction
{
	public void square()
	{
		
	}
}