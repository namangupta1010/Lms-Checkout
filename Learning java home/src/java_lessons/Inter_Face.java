package java_lessons;

public class Inter_Face {

	public static void main(String[] args) {
		IBM obj=new IBM();
		
		System.out.println("---------INDIA INTERFACE-------------");
		obj.Developers();
		obj.Testers();
		obj.Adminstartors();
		obj.BuisnessAnalyst();
		
		System.out.println(IndiaIT.min_emp);
		
		System.out.println("--------US INTERFACE-----------");
		
		obj.Ceo();
		obj.ProjectManagers();
		obj.SeniorStaff();
		
		System.out.println("-----------CLASS IBM has its own rules and regulations------------");
		
		obj.CountryHead();
		obj.SalaryINR();
		
		UsIt obj1 =new IBM();
		obj1.Ceo();
		obj1.ProjectManagers();
		obj1.SeniorStaff();

		//Child company extends the IBM class 
		IndiaIT obj2 =new ChildCompany();
		obj2.Adminstartors();
		obj2.BuisnessAnalyst();
		obj2.Developers();
		obj2.Testers();
		obj2.test();
		
	}
	
}
	
	//InterFace(Multiple Inheritance is supported through interface only)
	//100% Achievement of abstraction here
	class IBM implements UsIt,IndiaIT
	{

		@Override
		public void Developers() {
			System.out.println("Min 20 developers should be there to start compnany in India ");
			
		}

		@Override
		public void Testers() {
			System.out.println("Min 100 Testers should be there to start compnany in India ");
			
		}

		@Override
		public void Adminstartors() {
			System.out.println("Min 20 Adminstrators should be there to start compnany in India ");
			
		}

		@Override
		public void BuisnessAnalyst() {
			System.out.println("Min 5 BuisnessAnalyst should be there to start compnany in India ");
			
		}

		@Override
		public void Ceo() {
			System.out.println("1 CEO should be there to start compnany in US ");
			
		}

		@Override
		public void ProjectManagers() {
			System.out.println("Min 5 ProjectMangers should be there to start compnany in US ");
			
		}

		@Override
		public void SeniorStaff() {
			System.out.println("Min 20 SeniorStaff should be there to start compnany in Us ");
			
		}
		// Now IBM class has its own 2 methods
		public void CountryHead()
		{
			System.out.println("Country Head of both countires");
		}
		
		public void SalaryINR()
		{
			System.out.println("Both countries will get salaries in INR");
		}

		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
		
	}
class ChildCompany extends IBM
{
	public void Gurgoan()
	{
		System.out.println("Child company opens in Gurgoan");
	}
}