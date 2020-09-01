package edabit;

public class SwappingTwo {

	public static void main(String[] args) {

		//String str = "AA BB CC DD";
		String str = "--- How are you today - guys";
		String regex = "(\\b\\w+\\b)+\\s+(\\b\\w+\\b)";
		System.out.println(str.replaceAll(regex, "$2 $1"));
		
		String input = "abcdefghij";
		input = input.replaceAll("(..)(..)", "$2$1");
		System.out.println(input);

		
		//Create a function that takes an input (e.g. "5 + 4") and 
		//returns true if it's a mathematical expression or false if not.
		String n="6 % 7";
		String reg="(\\d+\\s*(\\*|\\/|\\+|\\-|\\%)\\s*)+(\\d+\\s*)";
	System.out.println(n.matches(reg));
	//	return expr.matches("\\d+\\s?[\\+\\*/%-]\\s?\\d+"); baskasinin cozumu
		
	}
}


