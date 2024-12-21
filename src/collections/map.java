package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class map {

	static void hashMap() {
		Map<Integer, String> hm = new HashMap();

		hm.put(1, "Rajesh");
		hm.put(1, "Rajesh");
		hm.put(3, "hari");
		hm.put(4, "Ragu");

		// System.out.println(hm.size());

		/*
		 * for(Integer i :hm.keySet()) { System.out.println(i); }
		 * 
		 * for(String j :hm.values()) { System.out.println(j); }
		 */
		for (Map.Entry i : hm.entrySet()) {
			System.out.println(i.getKey() + " : " + i.getValue());
		}

	}

	static void treeMap() {
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		// based on key tree map sorts
		hm.put(1, "Rajesh");
		hm.put(1, "Rajesh");
		hm.put(4, "hari");
		hm.put(3, "Ragu");

		Set set = hm.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry map = (Map.Entry) it.next();
			System.out.println(map.getKey() + " : " + map.getValue());
		}

	}

	static void linkedHashMap() {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap();
		// insertion order sort
		hm.put(1, "Rajesh");
		hm.put(5, "Rajesh");
		hm.put(3, "hari");
		hm.put(4, "Ragu");

		// hm.keySet().stream().forEach(i->System.out.println(i));
		hm.entrySet().stream().sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
				.forEach((i) -> System.out.println(i.getValue()));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedHashMap();
	}
}
