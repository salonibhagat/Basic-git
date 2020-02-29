package february9;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {

	HashMap<String, Integer> map = new HashMap<>();
	map.put("pune", 411014);
	map.put("mumbai", 400001);
	map.put("aurangabad", 401001);

	System.out.println(map);	
	System.out.println(map.keySet());	
	System.out.println(map.values());	
	System.out.println(map.size());	
	
	map.replace("pune", 411001);
	System.out.println(map);
	
	map.remove("punee");
	System.out.println(map);
	
System.out.println(	map.containsKey("nasik"));	
System.out.println(map.containsValue(400001));

System.out.println(map.get("punee"));

map.put("aurangabad", 123456); //replace if same key is there
System.out.println(map);

for (String key : map.keySet()) {
	
	System.out.println("key: " + key + " " + "value: " + map.get(key));
	
}




	}

}
