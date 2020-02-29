package february2;

import java.util.Scanner;

public class DevideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a no.");
		int x = obj.nextInt();
		
		int z = 0;
		String a = "";
		
		System.out.println("enter another no.");
	   int y = obj.nextInt();
	   
	   
	   try {
			System.out.println(a.length());
			z = x/y;
			}
	   catch (Exception e) {
		   e.printStackTrace();
			System.out.println("exception occured" + e.getMessage());
			z = 5;

		   }
		System.out.println("value of z is " + z);

		for(int i = 1; i<=z; i++) {
			
			System.out.println(i);

		}
		
		
		

	}

}
