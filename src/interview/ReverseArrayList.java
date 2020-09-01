package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		String input = "Geeks For Geeks";   
		List<Character> arrList = new ArrayList<>();      
		for (char c: input.toCharArray()){    
			arrList.add(c); 
		}   
		Collections.reverse(arrList);  
		
//		Object[] arr2 = arrList.toArray();     
//		
//		for(int i = 0; i <arr2.length; i++) {  
//       reverse += arr2[i];    
//} 
		System.out.println(arrList); 
		} 
	 
	 //NOT: BIR HATA VAR
	}


