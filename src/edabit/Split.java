package edabit;
import java.util.Date;
public class Split {

	public static void main(String[] args) {
		//Write a function that takes a string, 
		//breaks it up and returns it with vowels first, 
		//consonants second. For any character that's not a vowel (like special characters or spaces), 
		//treat them like consonants.
       //split("abcde") ➞ "aebcd"
		
		String str="What's the time?";
		
		String vowels = str.replaceAll("[^aeiouAEIOU]", "");
		String silents = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(vowels);
		System.out.println(silents);
		String result=vowels+silents;
		System.out.println(result);
		
		Date dt=new Date();
		System.out.println(dt.toString());
		
		String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
	    String[] arrSplit_2 = strMain.split(", ", 4);
	    for (int i=0; i < arrSplit_2.length; i++){
	      System.out.println(arrSplit_2[i]);
	      
	      	
	}
	    
}
}
