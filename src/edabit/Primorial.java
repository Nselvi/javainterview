package edabit;

public class Primorial {

	public static void main(String[] args) {
		int n=3;
		System.out.println(primorial(n));

	}
	public static int primorial(int n) {
		//OLMADI
		
		int fac = 1;

		for (int i = 1; i <= n; i++) {
			
			
			for (int i1 = 2; i1 < Math.sqrt(n); i1++) { 
				 
				 if (n % i1 == 0) {    
					 fac*=i1;; 
					 	 
					 
					 }
				 }
			
		}
		System.out.println(fac);
		 return fac;
		 
		
	}
	
}
