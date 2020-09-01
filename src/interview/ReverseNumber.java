package interview;

public class ReverseNumber {
	
	
	
	public static int reverse(int number){  
		int reverse = 0; 
		int remainder = 0;  
		do{   
		remainder = number%10;   
		reverse = reverse*10 + remainder;   
		number = number/10;   
		}
		while(number > 0);        
		return reverse; 
		} 
	 
	 

	public static void main(String[] args) {
		
//		ReverseNumber rev=new ReverseNumber();
//		rev.reverse(376);
    System.out.println(reverse(376));
    
    
	}

}
