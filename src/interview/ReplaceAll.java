package interview;

public class ReplaceAll {

	public static void main(String[] args) {
		
		String str="abFGcdeHIkl";
		System.out.println(str.replaceAll("[a-z]", "") + str.replaceAll("[A-Z]", ""));
		System.out.println(str.replaceAll("[A-Z]", "") + str.replaceAll("[a-z]", ""));
		
		String input = "1234567890";
		 
		String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
		 
		System.out.println(number);
		}
	}


