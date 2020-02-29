package february2;

public class FinallyBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 10;
int y = 20;
int z = 0;

try {
	z = x/y;
}
catch(Exception e) {
	System.out.println("Exception " +  e.getMessage());

}

finally {
	System.out.println("I am finally black");

}



	}

}
