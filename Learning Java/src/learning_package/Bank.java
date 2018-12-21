package learning_package;

class Balance{
	  static int accno;
	  static int bal;
	 static String name;;
	 public static void sbi()
	 {
		 System.out.println("Accno " + accno + " balace " + bal + " accname " + name);
		System.out.println("Balance is"+ bal);
	 }
	 public static void deposit(int dep)
	 {
	 	 System.out.println("Deposit money is"+ dep);
		 bal=bal+dep;
	 	 System.out.println("final balance money is"+ bal);
	}

	public static void output1(int wd)
	{
		System.out.println("witdraw money is"+ wd);
	 bal=bal-wd;
	System.out.println("final balance money after withdraw is"+ bal);
}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Balance s1=new Balance();
		Balance.accno=12;
		Balance.bal=3000;
		Balance.name="Naman";
		Balance.sbi();
		Balance.deposit(7000);
		Balance.output1(100);
		
		
		//Balance s2=new Balance();
		Balance.accno=13;
		Balance.bal=5000;
		Balance.name="raj";
		Balance.sbi();
		Balance.deposit(100);
		Balance.output1(50);

	}

}