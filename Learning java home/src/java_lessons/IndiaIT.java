package java_lessons;

public interface IndiaIT {

	
	//By default variables are static in interface
	int min_emp=50;
	
	//In interface only method we can declare not the method body also called abstract method
	public void Developers();
	
	public void Testers();
	
	public void Adminstartors();
	
	public void BuisnessAnalyst();
	
	abstract public void test();
	
}

