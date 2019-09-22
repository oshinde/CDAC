package CollectionAPI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<>();
		h.put("Omkar", 100);
		h.put("Atul", 120);
		h.put("Rahul", 130);
		h.put("Reshma", 140);
		h.put("Aishu", 120);
		h.put("Priyanka", 160);
		h.put("Mohini", 1000);
		h.put("Aman", 150);
		h.put("Ra", 1300);
		Iterator<Entry<String, Integer>> it = h.entrySet().iterator();
		while (it.hasNext()) {
			Object a = it.next();
			System.out.println(a);
		}

	}
}
