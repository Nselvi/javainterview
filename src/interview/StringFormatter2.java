package interview;

public class StringFormatter2 {
	public static String toggle(String str){ 
		
		//Java Program to tOGGLE each word in String
		
	    String words[]=str.split("\\s");  
	    String toggle="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	    }  
	    return toggle.trim();  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(StringFormatter2.toggle("my name is khan"));  
		    System.out.println(StringFormatter2.toggle("I am sonoo jaiswal"));     
		    }  
		}  
	


