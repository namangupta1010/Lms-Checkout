package java_lessons;

 class Balance{
	   int accno;
	   int bal;
	  String name;
	  static String branch="PNB BANK";
	 public void sbi()
	 {
		 System.out.println("Accno " + accno + " balace " + bal + " accname " + name);
		System.out.println("Balance is"+ bal + branch);
	 }
	 public void deposit(int dep)
	 {
	 	 System.out.println("Deposit money is"+ dep);
		 bal=bal+dep;
	 	 System.out.println("final balance money is"+ bal + branch);
	}

	public void output1(int wd)
	{
		System.out.println("witdraw money is"+ wd);
	 bal=bal-wd;
	System.out.println("final balance money after withdraw is"+ bal);
}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balance s1=new Balance();
		s1.accno=12;
		s1.bal=3000;
		s1.name="Naman";
		s1.sbi();
		s1.deposit(7000);
		s1.output1(100);
		
		
		Balance s2=new Balance();
		s2.accno=13;
		s2.bal=5000;
		s2.name="raj";
		s2.sbi();
		s2.deposit(100);
		s2.output1(50);

	}

}
