package edabit;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ConsecutiveList {

	public static void main(String[] args) {
		Integer arr[] = new Integer[]{2,4,6,8}; 
	
		
	  Arrays.sort(arr); 
	  
      System.out.println(Arrays.toString(arr));
      
      LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
      for (Integer t : arr) { 
      linkedHashSet.add(t);
      }
   System.out.println(linkedHashSet);
   
   int min=arr[0];
   for(int i=1;i<arr.length;i++){ 
     if(arr[i] < min){ 
       min = arr[i]; 
     } 
   } 
   
   int max=arr[0];
   for(int i=1;i<arr.length;i++){ 
     if(arr[i] > max){ 
       max = arr[i]; 
     } 
   } 
   
   System.out.println(min);
  int n=arr.length;
  int m=linkedHashSet.size();
  System.out.println(n);
  System.out.println(m);
  int total=min+n;
  

  
  
if(total==max) {
	System.out.println(true);
}else {
	System.out.println(false);
}
	}
	
}
	

	
	
