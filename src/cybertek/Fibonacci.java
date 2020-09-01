package cybertek;

public class Fibonacci {

	// Day:2 Task4
	//create a method that will accept a int number 
	//and will print that many Fibonacci numbers
	public static void main(String[] args) {
		
		Fibonacci(12);
		
	}
	
	public static void Fibonacci(int num) {
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b);
		
		for (int i = 2; i <= num; i++) {
			
			int next = a + b;
			a = b;
			b = next;
			System.out.print(" " + next);

	}
	}

}
