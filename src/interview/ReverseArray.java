package interview;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
	

	public static void main(String[] args) {
		
		Integer[] arr = {1, 2, 3, 4, 5, 6};
		 
        //print original array
        System.out.println("Original Array");
        
        
        for(int i : arr)
            System.out.print(i + ",");
        
        System.out.println("Max number : " + (arr[arr.length-1]));
        System.out.println("Max number : " + (arr[arr.length-2]));
 
        Collections.reverse(Arrays.asList(arr));
      //line break
        System.out.println("");
        
        //print reversed array        
        System.out.println("Reversed Array");        
        for(int i : arr)
            System.out.print(i + ",");  
        
	}

}
