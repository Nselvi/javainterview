package interview;

public class Edabit {

	public static void main(String[] args) {
		String str="abcd";
		//accum("abcd") ➞ "A-Bb-Ccc-Dddd"
				String s="";
				for(int i=0; i< str.length(); i++){
					s=s+str.charAt(i)+"-";
	}
				System.out.println(s);

}
}
