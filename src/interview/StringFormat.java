package interview;

public class StringFormat {

	public static void main(String[] args) {

		// ("abcd") ➞ "A-Bb-Ccc-Dddd"
		
	
		String str = "abcd";
		String strFinal = "";

		for (int i = 0; i < str.length(); i++) {
			// append the uppercase
			strFinal += Character.toUpperCase(str.charAt(i));
			

			// append the lower case
			for (int j = 0; j < i; j++) {
				strFinal += Character.toLowerCase(str.charAt(i));
			}

			// append the dash
			if (i + 1 < str.length()) {
				strFinal += "-";
			}
		}

		// return strFinal;
		System.out.println(strFinal);
	}
}
