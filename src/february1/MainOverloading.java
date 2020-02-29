package february1;

public class MainOverloading {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("main with string[]arg"); //only this main will work, jvm knows this keyword only

	}
public static void main(int[] args) {

System.out.println("main with int[]arg");


}
}
