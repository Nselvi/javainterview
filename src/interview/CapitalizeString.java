package interview;

public class CapitalizeString {
	//Create a function that capitalizes the last letter of every word

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cap = "";
		  String str = "hello  world again.";

		  String[] token = str.split("\\s+");

		  for (String s : token){
		      String firstChar = s.substring(0,1);
		      String between = s.substring(1, s.length()-1);
		      String LastChar = String.valueOf(Character.toUpperCase(s.charAt(s.length()-1)));
		      cap += firstChar+between+LastChar;
		      if (!cap.equals("")){
		        cap += " ";
		      }
		     
		  }
		  System.out.println(cap);
	}
}