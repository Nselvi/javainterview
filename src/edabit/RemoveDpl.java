package edabit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDpl {

	public static void main(String[] args) {
		//removeDups([1, 0, 1, 0]) ➞ [1, 0]
		int[] nums= {1, 0, 1, 0};
		String[] str= {"John", "Taylor", "John","Taylor", "John"};
		System.out.println(removeDups(str));
	}

	public static Integer[] removeDups(Integer[] nums) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i < nums.length; i++){
		    
		    if( !list.contains(nums[i]) ){
		        list.add(nums[i]);
		    }
		}
		nums=list.toArray(new Integer[list.size()]);
		 
            
		
	
		return nums;
		
		
	}
	
	
	public static String[] removeDups(String[] str) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i < str.length; i++){
		    
		    if( !list.contains(str[i]) ){
		        list.add(str[i]);
		    }
		}
		 str=list.toArray(new String[list.size()]);
		 Arrays.toString(str);
		 return str;
	}
}
