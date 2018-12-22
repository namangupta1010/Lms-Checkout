package java_lessons;


class Result{
	static int length;
	static int width;
	//public static void dimensions()


public static void display()
{
	int area=length*width;
	System.out.println("Area of rectangle=" + area);
}
}
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result s1=new Result();
		Result s2=new Result();
		//s1.dimensions(20,40);
		//s2.dimensions(50,30);
		s1.length=1;
		s1.width=20;
		s2.length=10;
		s2.width=50;
		s1.display();
		s2.display();	
		

	}

}
