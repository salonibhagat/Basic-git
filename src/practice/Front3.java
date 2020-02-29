package practice;

import java.util.Scanner;

public class Front3 {




	public static void main(String[] args) {

	Scanner obj = new Scanner(System.in);
	System.out.println("Enter a String: ");
String value =	obj.nextLine();
front3(value);	
System.out.println(front3(value));	
	
}



public static  String front3(String str) {
int x = str.length();
String front = str.substring(0, 3);
if(x>=3) {
return (front + front + front);
		}
else {
return front;
}


}
}