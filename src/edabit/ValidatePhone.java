package edabit;

public class ValidatePhone {

	public static void main(String[] args) {
		//String str = "578-332-1114";
		//System.out.println(str.matches("\\+?1?\\s?[-\\(\\.\\/\\s]?\\d{3}[-\\)\\.\\/]?\\s?\\d{3}[-\\.\\/\\s]?\\d{4}"));
		System.out.println(validate("578-332-1114"));
	}

	public static boolean validate(String str) {

		return str.matches("\\+?1?\\s?[-\\(\\.\\/\\s]?\\d{3}[-\\)\\.\\/]?\\s?\\d{3}[-\\.\\/\\s]?\\d{4}");

	}
}
