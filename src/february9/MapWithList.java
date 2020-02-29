package february9;

import java.util.ArrayList;
import java.util.HashMap;

public class MapWithList {

	public static void main(String[] args) {

	HashMap<Integer, ArrayList<String>>	map = new HashMap<>();
	
	ArrayList<String> list1 = new ArrayList<>();
	 list1.add("amol palekar");
	 list1.add("finance");
	 list1.add("developer");
map.put(11111, list1);
		System.out.println(map);	
		
		ArrayList<String> list2 = new ArrayList<>();

	list2.add("amol palekar");
	list2.add("finance");
	list2.add("develper");

	map.put(22222, list2);
	System.out.println(map);
	
	System.out.println(map.get(11111).get(2));
	
	}

}
