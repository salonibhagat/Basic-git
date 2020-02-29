package practice;

public class BackAround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

	
	
	
	public static String backAround(String value) {
	int x = value.length();
	String letter = value.substring(x, 1);
			
			if (x>=1) {
		return letter;
	}
			return value;
	
	
	}
}