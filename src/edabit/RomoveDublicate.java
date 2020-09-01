package edabit;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RomoveDublicate {

	public static void main(String[] args) {
		
		Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
		
		//This array has duplicate elements
        System.out.println( Arrays.toString(numbers) );
         
        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(numbers));
       
        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
        
        //Verify the array content
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
        
        String[] str = new String[] {"nevin","cihat","umit","nevin"};
    	LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>( Arrays.asList(str) );
    	  String[] strWithoutDuplicates = linkedHashSet2.toArray(new String[] {});
    	       //return Arrays.toString(strWithoutDuplicates) ;
    	  System.out.println(Arrays.toString(strWithoutDuplicates));
    }
	/*
	 import java.util.Arrays;
import java.util.LinkedHashSet;
public class Program {
	public static int[] removeDups(int[] nums) {
     LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(nums));
    Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
     return  Arrays.toString(numbersWithoutDuplicates);
        
	}

	public static String[] removeDups(String[] str) {
		LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>( Arrays.asList(str) );
    	  String[] strWithoutDuplicates = linkedHashSet2.toArray(new String[] {});
    	return Arrays.toString(strWithoutDuplicates);
	}
}
	 */
}