package edabit;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemZero {

	public static void main(String[] args) {
		
		 String str = "000123569,4"; 
	        
		 str=leadingZeroes(str);
	        System.out.println(str);
	        
		//	return n.replaceAll("^0+|0+$", ""); 
	}
	
	public static String leadingZeroes(String str) {
	
		return str.replaceAll("^0+", "");    
	    }
	
	public static String removeTrailingZeroes(String str) {
	    return str.replaceAll("0+$", "");
	}
}

