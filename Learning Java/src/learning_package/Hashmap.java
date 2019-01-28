package learning_package;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put("1", "Naman");
		hm.put("2", "Vikas");
		hm.put("3", "mahesh");
		hm.put("4", "harpal");
		
		System.out.println(hm);
		
		for(Entry m :hm.entrySet())
		{
			System.out.println(m.getKey() + "=" + m.getValue());
		}

	}

}
