package interview;

public class Prime { 
	
	public static void main(String[] args) {
	
	
	System.out.println(checkPrime(17));
	
	 } 
	
	public static boolean checkPrime(int n) { 
		
		 if (n <= 1) { 
			 return false; 
			 }
		for (int i = 2; i < Math.sqrt(n); i++) { 
			 
			 if (n % i == 0) {    
				 return false; 	 	 
				 
				 }
			 }
		 return true;
	}	
}
