package february2;

import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("enter a string");
       String a = obj.nextLine();
       String b = null;
       
       try {
   		System.out.println(a.charAt(6));

       }
	catch(StringIndexOutOfBoundsException s){
		System.out.println("exception" + s.getMessage());
       int length = a.length();
		System.out.println("max length of string " + length);

		}
       catch(NullPointerException n) {
   		System.out.println("exception " + n.getMessage());
       a = "pune";
       }
		catch(Exception e) {
			System.out.println("Exception is " + e.getMessage());

		}
		
		
		obj.close();
		
	}

}
