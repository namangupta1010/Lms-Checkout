package java_lessons;

class test
{
static int pie=3;
int r;
	public   void areaofcircle()
	{
		int area=pie*r*r;
		System.out.println("area of circle" + area);
	}
	public   void circumferenceofcircle()
	{
		int circum=2*pie*r;
		System.out.println("circumference of circle" + circum);
	}
	public void test() {
		// TODO Auto-generated method stub
		
	}
}



public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test s1=new test();
		s1.r=4;
		
		s1.areaofcircle();
		s1.circumferenceofcircle();

	}

}
