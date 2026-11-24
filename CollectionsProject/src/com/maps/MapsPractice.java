package com.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapsPractice {
	
		public static void main(String[] args) {
			
			
			Map<Integer, String> map = new HashMap<>();
			
			map.put(1, "Reddy");
			map.put(2, null);
			map.put(4, "Krishna");
			map.put(3, "Sneha");
			map.put(null, null);
			
			System.out.println(map);
			System.out.println(map.get(1));  // if u know the key we can get the value by using .get(key) method
			
			
			
			
			/*3 ways to print maps
			-> KetSet
			-> Values
			-> EntrySet */
			
			Set<Integer> keys= map.keySet();
			
			for(Integer key: keys) {
				
				System.out.println(key+" = "+map.get(key));

			}
			
			System.out.println("-------------");
			
			Collection<String> values = map.values();
			
			System.out.println(values);
			
			System.out.println("----------------");
			
			
			for(Map.Entry<Integer, String> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " = " +entry.getValue());
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

		private static void Practise() {
			Map map = new HashMap();
			
			map.put(1, "Tarun");  // .put(key, value) method used to insert the data into the maps
			map.put(2, "Krishna");
			map.put(3, "Sneha");
			map.put("Arun",	 23);
			map.put("Naidu", 17);
			map.put(4, "Fayaz");
			map.put(4, "sai");    // If we send duplicate keys in the background it changes the previous value to new value, it always override with the latest value, it doesn't give any exceptions	
			
			System.out.println(map);
		}

}
