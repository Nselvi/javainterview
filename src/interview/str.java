package interview;

public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String  card="1234123456785678";
				int len=card.length();
		   String first= card.substring(0,len-4); 
				String last=card.substring(len-4);
				
				String formated=first.replaceAll("[0-9]", "*");
				System.out.println(formated+last);
				
				
				System.out.println(card.replaceAll(".(?=.{4})", "*"));  // kisa yolu?

	}

}
