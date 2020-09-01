package interview;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class a {

	public static void main(String[] args) {
	
		String st="1 2 3 4 5";
     //"5 1"

		String  formated = st.replaceAll("\\s",""); 
		 System.out.println();
		System.out.println(formated.contains("-"));
		System.out.println(formated.indexOf("-"));
		
		 int n=formated.indexOf("-");
		 char[] chars = st.toCharArray();
		 
		 Arrays.sort(chars);
		 
		 String sorted = new String(chars);
		
    //System.out.println(sorted);
     
     System.out.println(sorted.charAt(sorted.length()-1));
     
		 
		 
	        String str="edcba";
//	        char[] chars = str.toCharArray();
//	        Arrays.sort(chars);
//	        String sorted = new String(chars);
//	    		//return sorted;
//	        System.out.println(sorted);
	        
	        
	        char tempArray[] = str.toCharArray(); 
	          
	        
	       Arrays.sort(tempArray); 
	        
	    System.out.println(new String(tempArray)); 
	        
	        
	        // convert input string to char array 
	       // char tempArray[] = str.toCharArray(); 
	          
	        // sort tempArray 
	       // Arrays.sort(tempArray); 
	          
	        // return new sorted string 
	       //String n=new String(tempArray); 
	        //System.out.println(n);
	        
	        
	        
	        
	        
	}  
	       
	    } 

