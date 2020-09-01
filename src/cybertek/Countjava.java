package cybertek;

public class Countjava {

	public static void main(String[] args) {
		// Cybertek task 2: Write a program that will count how many times “java” is 
		//found in any given String  ++
		String str="java is fun.java is the best.java";
		
		//approach 1
//		int java=0; 
//		
//		for(int i=0; i<str.length()-3; i++) {
//			if(str.substring(i, i+4).equalsIgnoreCase("java")) java++;
//				
//			}
//		System.out.println("java is found: "+java);
		
		
		//approach 2
		int java2=0;
		str=str.toLowerCase();
		
		while(str.contains("java")) {
			java2++;
			str=str.replaceFirst("java", "");
		}
		System.out.println("java "+java2);
		}
	
		
	}
