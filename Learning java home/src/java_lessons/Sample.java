package java_lessons;

public  class Sample {
	    int a=7;
	   int b=9;
	   public static void main(String[]args)
	   {
	   Sample obj=new Sample();
	   obj.addition();
	   obj.Subtraction();
	   Test1 obj1=new Test1();
	  // obj1.division();
	   obj1.addition();
	   obj1.Subtraction();
	   Test2.finaly();
	   }
	   
	   public   void addition()
	   {
		   int sum=a+b;
		   System.out.println(sum);
		   
		
	   }
	   public void Subtraction()
	   {
		   int diff=a-b;
		   System.out.println(diff);
	   }
	   
	 
	   }
class Test1 extends Sample
{
	int c=90;
	int d=10;
	public void addition()
	{
		int div =c/d;
		System.out.println(div);
	}
	
}




class Test2
{
	public static void finaly()
	{
		int i=0;
		
		try {
			System.out.println("Try testing");
			System.out.println(i);
			
		} catch (Exception e) {
System.out.println("Exception Testing");		
}
	
	finally
	{
		System.out.println("Finally Testing");
		
	}
}
}