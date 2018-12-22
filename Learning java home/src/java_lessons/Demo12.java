package java_lessons;

 class Employee {
	void student(int rollno, String name)
	{
		System.out.println(rollno +"and" + name);
		
	}
 }
	public class Demo12
	{
		public static void main(String[] args)	
		{
				Employee s1=new Employee();
				Employee s2=new Employee();
				s1.student(79,"Naman");
				s2.student(80, "papa");
		}
	}


