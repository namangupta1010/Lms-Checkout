package java_lessons;

public class Method {
	public static void main(String[]args)
	{
		Method obj=new Method();
		obj.test();
		obj.sum();
		String nameofmy=obj.name();
		System.out.println(nameofmy);
	}
public void test()
// No Return type
{
	System.out.println("Test Method");
}

public void sum()
{
	System.out.println("Test 1 Mehtod");
	int a=7;
	int b=8;
	int c=a+b;
	
System.out.println(c);
}
public String name()
//Return type String Value
{
	System.out.println("Name Mehtod");
	String myName ="Naman";
	
return myName;
}
}