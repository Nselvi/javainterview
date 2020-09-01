package cybertek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueChars {

	public static void main(String[] args) {
		//Task 4: Create a method that will accept a String and returns a
		//version that has only unique characters.
		//Ex: unique("AAABCCCDDEFFS")==> "BES"
  System.out.println(uniqueChar("AAABCCCDDEFFSGTTJB"));
	}
	public static String uniqueChar(String str) {
		
		String unique="";
		
		
		List<String>list=new ArrayList<>(Arrays.asList(str.split("")));
		
		for(String each:list) {
			int count=Collections.frequency(list, each);
			
			if(count==1) unique +=each;
		}
		
		
		
		return unique;
		
	}

}
