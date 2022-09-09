package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hm_Map {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("idli", 20);
		hm.put("Dosa", 25);
		hm.put("vada", 5);
		hm.put("idli", 25);
		System.out.println(hm);//key does not allow duplicate value will allow duplicate hence it override
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
		hm2.putAll(hm);
		//get
		System.out.println(hm2.get("Dosa"));
		//contains Key
		System.out.println(hm2.containsKey("poori"));
		//contains value
		System.out.println(hm2.containsValue(25));
		hm2.put("Chappathi",30);
		System.out.println(hm2);
		//remove
		hm2.remove("Chappathi", 30);
		System.out.println(hm2);
		//size
		System.out.println(hm2.size());
		//entryset
		Set<Entry<String, Integer>> s = hm.entrySet();
		System.out.println(s);
		//collection values
		Collection<Integer> v = hm.values();
		System.out.println(v);
		//keyset
		Set<String> ks = hm.keySet();
		System.out.println(ks);
		
		
	}

}
