package qsp1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class javaprgram {
	
	
	public static void main(String [] arg) {
		HashMap<String,String> map=new HashMap<>();
		map.put("name" , "rahul");
		map.put("city" , "mumbai");
		map.put("area" , "btr");
		String v = map.get("name");
		System.out.println(v);
		System.out.println(map.get("city"));
		map.put("city","mysore");
		System.out.println(map.get("city"));
		System.out.println(map.containsKey("area"));
		System.out.println(map.containsKey("road"));
		Set<String> set = map.keySet();
		System.out.println(set);
		for(String key:set) {
			System.out.println(key);
			
		}
		Collection<String> allvalues = map.values();
        System.out.println(allvalues);
        for(String values:allvalues) {
        	System.out.println(values);
        	
        }
		
		
	}

}
