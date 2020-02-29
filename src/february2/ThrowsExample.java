package february2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
	public static void main(String[] args) throws Exception {
myException("chrome");
	
	}
	
/*	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
openFile("abc.txt");
	}*/
	
	
public static void openFile(String path) throws FileNotFoundException {
	File fh = new File(path);
	FileInputStream io = new FileInputStream (fh);
}
public static void myException(String browserName) throws Exception {
	if (browserName.equals("chrome")) {
		System.out.println("Browser Chrome");
		}
	else if(browserName.equals("Firefox")) {
		System.out.println("Browser FireFox");
    }
	
	else {
		throw new Exception("Invalid Browser Name");
	}


}
	
	
	

}
