package interview;

public class CapFirstLetter {


		public static String capitalize(String str) {
			
			String[] words = str.split("\\s");
			StringBuilder sb = new StringBuilder();

			for (String s: words) {
				if (!s.equals("")) {
					sb.append(Character.toUpperCase(s.charAt(0)));
					sb.append(s.substring(1));
				}
				sb.append(" ");
			}

			// trim() to remove extra space in the end before returning
			return sb.toString().trim();
		}

		public static void main(String[] args)
		{
			String sentence = "techie   delight is awesome!";
			String str = capitalize(sentence);

			System.out.println(str);
		}
	}
