package java_lessons;


class circle1{
	static int pie=3;
	int r;
	public  circle1(int r)
	{
		int area=pie*r*r;
	System.out.println("area is" + area);
}
	public  circle1(double r)
	{
		double area=pie*r*r;
	System.out.println("area is" + area);
}
	public void circum(int r)
	{
		int circum=2*pie*r;
		System.out.println("circum is" + circum);
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle1 s1=new circle1(9);
		circle1 s2=new circle1(9.5);
		s1.circum(5);
		s2.circum(6);
		
		

	}

}
