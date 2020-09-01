package edabit;

public class LetterCheck {

	
	public static void main(String[] args) {
		String []s= {"trances", "nectar"};
		
	
		String a = s[0].toLowerCase();
		String b = s[1].toLowerCase();
   
		for (char c : b.toCharArray()) 
			if (!a.contains(Character.toString(c))) 
				//return false;
				System.out.println(false);
		//return true;
		System.out.println(true);
	}
}

