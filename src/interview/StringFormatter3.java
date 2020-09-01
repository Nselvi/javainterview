package interview;

public class StringFormatter3 {
	
	//Java Program to reverse tOGGLE each word in String
	
	public static String reverseToggle(String str){  
	    String words[]=str.split("\\s");  
	    String reverseToggle="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        //sb.reverse();  
	        //String first=sb.substring(0,1);  
	        //String afterfirst=sb.substring(1); 
	        String first=sb.substring(0,sb.length()-1);  
	        String afterfirst=sb.substring(sb.length()-1,sb.length());
	        
	        //reverseToggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	        reverseToggle+=first+afterfirst.toUpperCase()+" ";  
	    }  
	    return reverseToggle.trim();  
	}  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(StringFormatter3.reverseToggle("my name is khan"));  
		  System.out.println(StringFormatter3.reverseToggle("My Name Is Edabit")); 
	}

}
