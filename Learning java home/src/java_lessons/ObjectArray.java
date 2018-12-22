package java_lessons;

public class ObjectArray {

	public static void main(String[] args) {
		// Object array is used to store different data types values
		Object obj[]=new Object[6];
		obj[0] = "Naman";
		obj[1] = "Gupta";
		obj[2]=12;
		obj[3]="London";		
		obj[4]="10/01/1994";
		obj[5]=12.33;
		
	
	for(int j=0;j<obj.length;j++)
		{
		System.out.println(obj[j]);
		}
		

	}

}
