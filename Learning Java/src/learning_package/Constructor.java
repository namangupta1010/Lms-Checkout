package learning_package;



class student{
	
	public  student(int i,String n, int a) 
	{
	System.out.println("Student 1 information"+ i + n + a);
	
}
	public  student(int j,String h, String l) 
	{
	System.out.println("Student 1 information"+ j + h + l);
	
}
	
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1=new student(6,"naman",56);
		student s2=new student(6,"naman","Vikas");
		//s1.student(1, "naman", 25);
		//s1.student(2, "vikas", 20);
		

	}

}
