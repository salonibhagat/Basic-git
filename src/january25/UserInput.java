package january25;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
	/*	System.out.println("Enter number");
		int num = obj.nextInt();
		int temp;
		int rev = 0;
		int number = num;
		while (num>0) {
			temp = num%10;
           rev = (rev*10) + temp;
		   num=num/10;
	
			
		}
		if (number == rev) {
			System.out.println("Number is palindrome: " + number);

		}*/
		
		System.out.println("Enter number");
		int num = obj.nextInt();
		int temp;
		int rev = 0;
		int number = num;
		
		String name = "yes";
		
		while (num>0) {
			temp = num%10;
           rev = (rev*10) + temp;
		   num=num/10;
	
		}
		   if (number == rev) {
			System.out.println("Number is palindrome: " + number);
			    }
		   
		
		}
}
