package exerciseJan19;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int x = 2;
		int y = 3;
		int z;
		
		System.out.println("Befor Swaping x: " + x + " and  y: " + y );
		
		z = x;
		x = y;
		y= z;
		
		System.out.println("After Swaping x: " + x + " and  y: " + y );*/
		
		int x = 20;
		int y = 10;
		System.out.println("Befor Swaping x: " + x + " and  y: " + y );
		
       x = x+y;
       y = x-y;
	   x = x-y;		
		System.out.println("After Swaping x: " + x + " and  y: " + y );
	

	}

}
