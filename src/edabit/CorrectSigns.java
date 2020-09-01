package edabit;

public class CorrectSigns {

	public static void main(String[] args) {
		System.out.println(correctSigns("4 > 3 > 2 > 1")) ;
		//correctSigns("13 > 44 > 33 > 1") ➞ false

		//correctSigns("1 < 2 < 6 < 9 > 3") ➞ true
	}
	 public static boolean correctSigns(String str) {
		 
		 String[] arr = str.split(" "); 
	
		 for(int i=0; i< arr.length;i++) {
			if(arr[i+1]==">") {
				if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[i+2])) {
					i+=1;
					return true;
				}
			}else if(arr[i+1]=="<") {
				if(Integer.parseInt(arr[i]) < Integer.parseInt(arr[i+2])) {
					i+=1;
					return true;
				}
			}
			
		 }
		return false;		
					
	 }
		
	 }

