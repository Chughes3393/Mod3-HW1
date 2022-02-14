package Lessons;

import java.util.HashMap;

public class HashMapLesson {

	public static void main(String[] args) {
// A map is an object that contains key value pairs 
//		It maps each key to a value and doesnt contain duplicate keys 
//		Sytax: HashMap <Key, Value>
//		Create a HashMap - need to import
		HashMap<String, String> map1 = new HashMap<>(10);
		
		
//		Adding key value pairs to our map 
		map1.put("Teo", "villain");
		map1.put("Orella", "Superhero");
		
		System.out.println(map1);

		
		map1.put("Teo", "supervillain");
		
		System.out.println(map1);
		
		map1.remove("Teo");
		System.out.println(map1);
		
		map1.clear();
		System.out.println(map1);
	}

}
