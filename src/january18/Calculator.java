package january18;

public class Calculator {
	int x,y;
	 
	
	Calculator (int iX, int iY ){
		x = iX;
		y = iY;
		
		}
	
public void display() {
	System.out.println("Addition of two numbers is: " + (x+y));
	System.out.println("Subtraction of two numbers is: " + (x-y));
	System.out.println("Multipication of two numbers is: " + (x*y));
	System.out.println("Division of two numbers is: " + (x/y));
}
}
