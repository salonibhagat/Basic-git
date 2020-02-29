package february8;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		
		ArrayList<String> obj = new ArrayList<>();
		obj.add("pune");
		obj.add("mumbai");
		obj.add("nashik");
		obj.add("aurangabad");
		obj.add("pune");
		obj.add("mumbai");

		System.out.println(obj);
	
		System.out.println(obj.size());
	
		System.out.println(	obj.contains("delhi"));
	
	System.out.println(	obj.indexOf("mumbai"));
	
	System.out.println(obj.get(3));
	
	System.out.println(obj.subList(0, 3));
	
	List<String> newList = obj.subList(3, 5);  //list creation
	System.out.println(newList);
	newList.add("amravati");
	System.out.println(newList);
	
	// obj.remove(0);
	System.out.println(obj);
	
	for(int i=0; i<obj.size(); i++) {
		System.out.println(obj.get(i) + "");
	} //regular for loop
	
	for (String value : obj) {
		
		System.out.println(value);
		
	} //this for loop only used for list and set
	
	
	
	}

}
