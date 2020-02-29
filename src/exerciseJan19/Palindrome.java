package exerciseJan19;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num = 191;
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

		}*/
		
		
		for (int num = 1; num <= 1000; num++ ) {
			
			int rev = 0;
			int temp;
			int number = num;
			while(number > 0) {
				temp = number%10;
				rev = (rev*10) + temp;
				number=number/10;
			}
			
			if (num == rev) {
				System.out.println("Number is palindrome: " + num);

			}
			
			
		}

	}

}
