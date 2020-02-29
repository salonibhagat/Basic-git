package january26;



public class ExecutionOfInheritance extends Inheritace{
	public void add(int x, int y, int z) {
		System.out.println("Addition of two numbers is: " + (x+y+z));

	}
	public static void main(String[] args) {
		ExecutionOfInheritance nc = new ExecutionOfInheritance();
		nc.add(2, 2);
        nc.add(1, 2, 3);
        nc.div(25, 5);
        
	}

	

}
