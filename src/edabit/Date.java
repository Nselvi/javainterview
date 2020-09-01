package edabit;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) throws ParseException {
		
		
		//convertTime("16:20 pm") ➞ "18:20"
		
		String input = "16:20";
	      //Format of the date defined in the input String
	      DateFormat df = new SimpleDateFormat("hh:mm aa");
	      //Desired format: 24 hour format: Change the pattern as per the need
	      DateFormat outputformat = new SimpleDateFormat("HH:mm");
	      java.util.Date date = null;
	      String output = null;
	      try{
	         //Converting the input String to Date
	    	 date= df.parse(input);
	         //Changing the format of date and storing it in String
	    	 output = outputformat.format(date);
	         //Displaying the date
	    	 System.out.println(output);
	      }catch(ParseException pe){
	         pe.printStackTrace();
	       }
	   }
	}