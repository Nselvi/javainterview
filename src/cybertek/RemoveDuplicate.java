package cybertek;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		//Test 3:Create a method that will accept a String and returns a 
		//version that removes duplicate instances of any character 
		
		//String str="AAABBBCCCD"; // -> ABCD
		System.out.println(removeDupValues("AAABBBCCCD"));


	}
	public static String removeDupValues(String str) {
		
		String []arr=str.split("");
		LinkedHashSet<String>set= new LinkedHashSet<>(Arrays.asList(arr));
		return set.toString().replace("[","").replace("]","").replace(", ", "");  
		
		
	
		
	}
	

}
