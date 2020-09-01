package interview;

public class Stringreverse {

	public static void main(String[] args) {

		//System.out.println(str2.reverse());

		 String name= "Nevin Selvitopu";
		 
		String reversed = new StringBuilder(name).reverse().toString();
		 System.out.println(reversed);
		
		//String str2 = "Automation";	 
//		StringBuilder str2 = new StringBuilder(str);
//		System.out.println(str2.reverse());
	//	System.out.println();
		//System.out.println(Math.pow((int)Math.sqrt(33),2) == 33);
		
		String  str="Automation";
		String reverse= "";  
		for(int i = str.length()-1; i >=0; i--) {   
			reverse += str.charAt(i); 
			}
		System.out.println(reverse);
	}

}
