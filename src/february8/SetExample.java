package february8;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {

	HashSet<String> set = new HashSet<>();
	
	set.add("maharashtra");
	set.add("karnataka");
	set.add("gujrat");
	set.add("maharashtra");
	set.add("telangana");
	set.add(null);
	set.add(null);

	System.out.println(set);	
		
	for (String s : set) {
		System.out.println(s);
	}
	
	
	}

}
