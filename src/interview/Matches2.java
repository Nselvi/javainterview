package interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matches2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="TrAdE6W1n95!";

		//Pattern p = Pattern.compile("\\d+");
        //Matcher m = p.matcher(str);
       // while(m.find()) {
         //  System.out.println(m.group());
      // StringBuilder sb = new StringBuilder(str);
    String s=str.replaceAll("[^0-9]", "");
    System.out.println(s.charAt(0));   
    System.out.println(s.substring(0,1));
    
    //return Integer.parseInt(s.substring(0,1));
		
	}

}

