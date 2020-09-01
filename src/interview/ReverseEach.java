package interview;

public class ReverseEach {
	
	//Java Program to reverse each word in String
	
	public static String reverseWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWord("my name is khan"));  
	    System.out.println(ReverseEach.reverseWord("I am sonoo jaiswal"));    
	}

}
