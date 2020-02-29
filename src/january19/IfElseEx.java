package january19;

public class IfElseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	int x = 10;
		int y = 20;
		int z = 30;
		
	if (x < y) {
			System.out.println(" X is smaller than Y");
			if(x<z) {
				System.out.println("X is smaller than Z");
				
			}
		}*/
		
/*if (x<y && x<z) {
	System.out.println("X is smaller than Y and Z");
}*/ 
		
		/*if (x<y) {
			System.out.println("X is smaller than Y");
		}
		else {
			System.out.println("X is greater than Y");
		}*/
		int x = 11;
		int y = 12;
		int z = 13;
		
		/*if (x>y && x>z) {
			System.out.println("X is Greater");
			

			}
		if (y>x && y>z) {
			System.out.println("Y is greater");
		}
		else
		{
			System.out.println("Z is greater");

		}*/
		if (x>y && x>z) {
			System.out.println("X is Greater");
		}
		else if (y>z) {
			System.out.println("Y is Greater");
		}
		else {
			System.out.println("Z is Greater");
		}
		
		
	}

}
