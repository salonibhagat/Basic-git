package february8;

import java.util.ArrayList;

public class MultiList {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		
	list2.add(4);
	list2.add(5);
	list2.add(6);
	list2.add(7);
	
	list3.add(8);
	list3.add(9);
	list3.add(10);
	
	System.out.println(list1);
	System.out.println(list2);
	System.out.println(list3);

	list.add(list1);
	list.add(list2);
	list.add(list3);
	
	System.out.println(list);
	
//	System.out.println(list3.get(2));
	
	ArrayList<Integer> temp = list.get(2);
	System.out.println(temp);
	System.out.println(temp.get(2));
	
	
	
	System.out.println(list.get(1).get(2));//fetching value from list
		
			
	}

}
