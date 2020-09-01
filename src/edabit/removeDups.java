package edabit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeDups {

	public static void main(String[] args) {
		
				String[] str = {"The", "big", "cat","The" };
				 
				//create new ArrayList
				ArrayList<String> aList = new ArrayList<String>();
				
				for(int i=0; i < str.length; i++){
				    
				    if( !aList.contains(str[i]) ){
				        aList.add(str[i]);
				    }
				}
				 
				//convert ArrayList back to array
				str = aList.toArray( new String[aList.size()] );
				 
//				System.out.println("Array after removing duplicates: " 
//				+ Arrays.toString(str));
				System.out.println(Arrays.toString(str));
	
	}
	}
		
		