package learning_package;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Advanced S1=new Advanced();
		Advanced S2=new Advanced();
		S1.record(100,"Naman");
		S2.record(500,"Raj");
		//System.out.println("id =" +   S1.id  + " name " + S1.name  );
		//System.out.println("id =" +   S2.id  );

	}
}
class Advanced{
	 int id;
     String name;
     public static void record(int r, String n)
     {
    	 System.out.println(r+n);
     }
}

