package edabit;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=33;
		 if (n <= 1) { 
			 //return false; 
			 System.out.println(2);
			 }
		for (int i = 2; i < n; i++) { 
			 
			 if (n % i == 0) {    
				 //return false; 
				 	//System.out.println("false"); 
				 n++;
				 }
			 }
		//HAtali
		System.out.println(n);
		 
		
		
	}
	
}
	
