package java_lessons;

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("For Me--------");
		Naman obj= new Naman();
		obj.PapaKapaisa();
		obj.Merapaisa();
		obj.DadajiKaPaisa();
		
		
		System.out.println("For Papa--------");
		
		Papa obj1=new Papa();
		obj1.PapaKapaisa();
		obj1.DadajiKaPaisa();
		
		System.out.println("For Dadaji------------");
		Dadaji obj2= new Dadaji();
		obj2.DadajiKaPaisa();
		
		System.out.println("For Tauji------------");
		Tauji obj3= new Tauji();
		obj3.DadajiKaPaisa();
		obj3.TaujikaPaisa();
		

	}
}
class Dadaji
{
	public void DadajiKaPaisa()
	{
		System.out.println("Dada ji ka paisa");
	}
}
	 class Papa extends Dadaji
	{
		 public void PapaKapaisa()
		 {
		System.out.println("papa ji ka paisa");
	}
	}
	 class Tauji extends Dadaji
	 {
		 public void TaujikaPaisa()
		 {
			 System.out.println("Tau ji ka paisa");
		 }
	 }

	 class Naman extends Papa
	{
		public void Merapaisa()
		{
			System.out.println("Naman ka paisa");
		}
	}

