package january19;

public class BreakContinueE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int x = 1; x <=10; x++) {
			System.out.println(x);
			
			if(x==5) {
			break;}
			}
		System.out.println("Outside for loop");*/
		for(int x = 1; x <=10; x++) {
			System.out.println(x);
			
			if(x==5) {
			continue;}
			}
		System.out.println("Outside for loop");


	}

}
