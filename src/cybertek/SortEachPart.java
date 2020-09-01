package cybertek;

import java.util.Arrays;

public class SortEachPart {

	public static void main(String[] args) {
    // Create a method that will take any String of letters and numbers 
		//and sort each substring of numbers and letters
		
		String str = "DC501GCCCA098911";
		System.out.println(sortEach(str));
	}

	public static String sortEach(String str) {
		
		String sorted="";   //final result
		
		String each="";    
		
		for(int i=0; i<str.length();i++) { //loops through the all string
			each +=str.charAt(i);
			
			if(Character.isLetter(str.charAt(i))) {
				//if next char is letter, then ever thing is okay
				//if next char is not letter, we need to take the each substring and sort it
				if(i==str.length()-1 || !Character.isLetter(str.charAt(i+1))) {
					sorted +=sortSubstring(each);
					each="";
				}
			}else {
				
				if(i==str.length()-1 || !Character.isDigit(str.charAt(i+1))) {
					sorted +=sortSubstring(each);
					each=""; //reset each to get ready for letter
				}
			}
		}
			
		return sorted;

	}
	
	private static String sortSubstring(String str) {
		
		String [] arr=str.split(str);
		Arrays.sort(arr);
		
		return Arrays.toString(arr).replace("[","").replace("]","").replace(", ", "");
		
	}

}
