package edabit;


import java.util.HashSet;
import java.util.Set;



public class Pandigital {

	public static void main(String[] args) {
		
	System.out.println(isPandigital(1234567890));
			
	}   
   public static boolean isPandigital(long num) {
	Set <Character> hs=new HashSet<Character>();
	
	for (char c:String.valueOf(num).toCharArray()){
		hs.add(c);
	}
	return hs.size()==10;
}
}




