package interview;

public class StrCap {

	public static void main(String[] args) {
		
		 System.out.println(StringFormatter.capitalizeWord("my name is khan"));  
		    System.out.println(StringFormatter.capitalizeWord("I am sonoo jaiswal"));
		    System.out.println(StringFormatter.capitalizeWord("nevin selvitopu"));

String str="My name is Nevin";
		    String words[]=str.split("\\s");  
		    String reverseWord="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverseWord+=sb.toString()+" ";  
		    }  
		    //return reverseWord.trim();
		    System.out.println(reverseWord.trim());
	}

}
