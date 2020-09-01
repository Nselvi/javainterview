package cybertek;

public class PalindromeNumber {

	public static void main(String[] args) {
		//Day2 Task3 +
		//Create a method that will accept a number (long) 
		//and determine if the number of palindrome or not
System.out.println(isPalindrome(12321));
	}

	public static boolean isPalindrome(long num) {
		
		long remain=num;
		long rev=0;
		
		while(remain !=0) {
			long digit=remain % 10;
			rev=rev * 10 +digit;
			remain /=10;
		}
		
		return num==rev;
		
	}
}
