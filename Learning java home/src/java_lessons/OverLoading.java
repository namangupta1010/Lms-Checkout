package java_lessons;

public class OverLoading {
int num=78;
String var="Global Variable";
static int oo=90;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverLoading obj = new OverLoading();
obj.sum();
obj.sum("Good Afternoon");
obj.sum(5, 7);
obj.sum(100);
main(45);
main(78);
main("MM");
obj.sum();
System.out.println(obj.num);
//System.out.println(obj.num);
System.out.println(obj.var);

obj.sum("end");
System.out.println(oo);
	}
	public static void main(String a)
	{
		
	System.out.println("Main method 1");	
	}
	public static void main(int a)
	{
		System.out.println("Main method 2");
	}

	public void  sum()
	{
		
		System.out.println(num + "ooooo");
		System.out.println("Hello World");
	}

	public void  sum(int a)
	{
		System.out.println("Hello World");
		System.out.println(a);
	}

	public void  sum(int a,int b)
	{
		System.out.println("Hello World");
		System.out.println(a+b);
	}

	public void  sum(String a)
	{
		System.out.println("Hello World");
		System.out.println(a);
	}
}
