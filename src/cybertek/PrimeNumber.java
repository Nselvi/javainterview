package cybertek;

import interview.Prime;

public class PrimeNumber {
/*
    Day2 Task1 :Create a method that will accept a number and print
    all the prime number from 2 to that given number
     ? Print yapmiyor, bir hata var?
     */

	public static void main(String[] args) {
		
		printAllTo(100);
		//System.out.println(printAllTo(100));
	}

	public static void printAllTo(int num) {

		for (int i = 2; i <= num; i++) {

			if (isPrime(i)) {
				System.out.println(i);

			}
		}
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
