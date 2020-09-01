package cybertek;

public class Polindrome {

	public static void main(String[] args) {

		String str = "abcdcba";
		boolean check = true;

		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				check = false;
				break;
			}
		}
		//System.out.println(check ? : Polindrome : Not Polindrome);
		if(check) {
			System.out.println("Polindrome");
		}else {
			System.out.println("Not Polindrome");
		}

	}

}
