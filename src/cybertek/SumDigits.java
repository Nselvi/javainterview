package cybertek;

public class SumDigits {

	public static void main(String[] args) {
		
		//create a program that will take any string and print the sum 
        //+
		String str = "jav45ai15sgreat82";
		int sum=0;
		String num="";
		
		for(int i=0; i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				num+=str.charAt(i);
				
				if(i==str.length()-1 || !Character.isDigit(str.charAt(i+1))) {  //i==str.length()-1  yazmazsan exception
					sum+= Integer.parseInt(num);
					num="";
				}
			}
		}
		System.out.println(sum);
		

	}

}
