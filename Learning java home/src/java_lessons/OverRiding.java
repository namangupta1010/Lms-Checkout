package java_lessons;

public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
	obj.ManualTesting();
	obj.AutomationTesting();
	obj.DatabaseTesting();
	obj.ManualTesting();
	System.out.println(obj.ManualTesting());
	
	
		
	
	A obj1=new A();
	obj1.DatabaseTesting();
	obj1.AutomationTesting();
	obj1.ManualTesting();
	
	System.out.println(obj1.ManualTesting());
		

	}
}
	class A
	{
		public int ManualTesting()
		{
			System.out.println("Super class A only knows Manual Testing");
			return 7;
			
		}
		public void AutomationTesting()
		{
			System.out.println("A knows bit automation testing");
		}
		public void DatabaseTesting()
		{
			System.out.println("A knows Database Testing");
	}
	}

	
	class B extends A
	{
		public int ManualTesting()
		{
			System.out.println("This sub class B also knows manual Testing ");
			return 4;
		}
		
		public void DatabaseTesting()
		{
			System.out.println("B knows Database Testing");
	}
	}

