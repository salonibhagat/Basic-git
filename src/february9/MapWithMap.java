package february9;

import java.util.ArrayList;
import java.util.HashMap;

public class MapWithMap {

	public static void main(String[] args) {

	HashMap<String, HashMap<Integer, ArrayList<String>>> map = new HashMap<>();
		
	ArrayList<String> list1 = new ArrayList<>();
	ArrayList<String> list2 = new ArrayList<>();
	ArrayList<String> list3 = new ArrayList<>();
	HashMap<Integer, ArrayList<String>>  details = new HashMap<>();
	HashMap<Integer, ArrayList<String>>  details1 = new HashMap<>();
	HashMap<Integer, ArrayList<String>>  details2 = new HashMap<>();

	
	list1.add("amol shende");
	list1.add("developer");
    list1.add("java");

	list2.add("anil kale");
	list2.add("developer");
	list2.add(".Net");
	
	list3.add("deepak B");
	list3.add("tester");
	list3.add("manual");

	details.put(1001, list1);
	details1.put(1002, list2);	
	details2.put(1003, list3);
	
	map.put("Finance", details);
	map.put("Banking", details1);
	map.put("Investment managment", details2);
	
	System.out.println(map);
	
	System.out.println(map.get("Banking").get(1002).get(0));
	

		
		
		
	}

}
