package interview;

public class Polindrome {

	public static void main(String[] args) {
		
     String str="madam";
   if(str == null)   
	  // return false; 
	   System.out.println("false");
   
   StringBuilder sb = new StringBuilder(str); 
  // return sb.reverse().toString().equals(str);
   System.out.println(sb.reverse().toString().equals(str));
   
   
   
   
//     String s="";
//     for(int i=str.length()-1; i>=0 ; i--) {
//    	 s+=str.charAt(i);
//     }
//     System.out.println(s);
//     if(s.equals(str)) {
//    	 System.out.println("Polindrome");
//     }else {
//    	 System.out.println("Not Polindrome");
//     }
  } 
     
	}


