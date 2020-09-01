package interview;

public class Matches {

	public static void main(String[] args) {
		
		String s="(123) 456-7890";
		String str="1111 555 2345";
		
		System.out.println(s.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}"));
		
		System.out.println(str.matches("\\d{4}\\s\\d{3}\\s\\d{4}"));
	}

}
