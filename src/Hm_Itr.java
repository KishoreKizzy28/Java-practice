package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Hm_Itr {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Nellai Exp", 1500);
		hm.put("Chennai Exp", 1500);
		hm.put("Banglore Exp", 1400);
		hm.put("Mumbai Exp", 1700);
		System.out.println(hm);
		Set<Entry<String,Integer>> s = hm.entrySet();
		System.out.println(s);
		Iterator<?> i = s.iterator();
		while(i.hasNext())
		{
		
			Object o = i.next();
			@SuppressWarnings("unchecked")
			Entry<String, Integer> e = (Entry<String, Integer>)o;
			Object Trn_name= e.getKey();
			//System.out.println(e.getKey());
			//System.out.println(e.getValue());
			if(e.getValue().equals(1500))
			System.out.println(Trn_name);
			if(Trn_name.equals("Nellai Exp"))
			{
				e.setValue(1530);
			
			}
			System.out.println(s);
		}
		
	}

}
