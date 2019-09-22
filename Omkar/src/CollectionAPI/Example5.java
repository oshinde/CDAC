package CollectionAPI;

import java.util.HashMap;
import java.util.Scanner;

public class Example5 {
	
	public void method(String str) {

		HashMap<String, String> h = new HashMap<>();
		h.put("1", "Sachin");
		h.put("2", "Virat");
		h.put("3", "Rahul");
		h.put("4", "AB Dvillers");
		h.put("5", "Rohini");
		h.put("6", "Supriya");
		h.put("7", "Tata");
		h.put("8", "Bata");
		h.put("9", "Ambani");
		h.put("10", "Birla");
		h.put("11", "Tiger");
		h.put("12", "Lion");
		
		System.out.println("Name of the player is:"+h.get(str));
		
	}

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		String i = s.next();
		Example5 a = new Example5();
		a.method(i);
		s.close();

	}

}
