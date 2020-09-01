package interview;



public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse the String, check if it is polindrome or not.

		String s = "madam";
		String t = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		
		}
		System.out.println(t);
		if (s.equals(t)) {
			System.out.println("Polindrome");

		}

	}
}
