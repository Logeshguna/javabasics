package arrayprcticesession;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String,Integer> hm=new HashMap<String,Integer>();
		hm.put("raja", 1);
		hm.put("anadh", 2);
		hm.put("ranga", 3);
		System.out.println(hm);
		hm.remove("ranga");
		System.out.println("After removing value"+hm);
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
