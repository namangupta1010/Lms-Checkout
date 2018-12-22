package java_lessons;

public abstract class Shape {

	
	//We cannot create method body inside this abstract method
	public abstract void circle();
	
	public abstract void sqaure();
	
	
	
	public void rectangle()
	{
		System.out.println("Rectangle method(not abstarct method)");	
	}
	
	}
