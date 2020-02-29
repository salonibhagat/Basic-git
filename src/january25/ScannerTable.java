package january25;

import java.util.Scanner;

/*public class ScannerTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = obj.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "x"+i +"="+i*num);

		}
		
		


	}

}*/

// ==============================user choice==========================

public class ScannerTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		Scanner objString = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = obj.nextInt();
		checkNumberPalindrome(num);
		//obj.nextLine();
		System.out.println("Do you want to continue? (yes/no)");
		String userChoice = objString.nextLine();
		
while(userChoice.equals("yes")) {
	System.out.println("Enter number");
	num = obj.nextInt();
	checkNumberPalindrome(num);
	System.out.println("Do you want to continue? (yes/no)");
	 userChoice = objString.nextLine();
	

}
	obj.close();
	objString.close();
		
		
		}
	static void checkNumberPalindrome(int num) {
		int rev = 0;
		int temp;
		int number = num;
		while(num > 0) {
			temp = num%10;
			rev = (rev*10) + temp;
			num=num/10;
		}
		if (number == rev) {
			System.out.println("Number is palindrome: " + number);

		}
		else {
			System.out.print("Number is not palindrome");

		}
	}
		
		


	}



