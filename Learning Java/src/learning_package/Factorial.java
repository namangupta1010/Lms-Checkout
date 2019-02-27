package learning_package;

public class Factorial {

	public static int  fact(int num)
	{
		int temp = 1;
		for(int i=1; i<=num;i++)
		{
			temp =temp *i;
		}
		return temp;
	}




	public static void main(String[] args)
	{
		System.out.println(fact(6));
	}



}
