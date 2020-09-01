package interview;

import java.util.ArrayList;

import java.util.Arrays;

public class ArraySort2 {

	public static void main(String[] args) {
		int n=0;
		int [] array = {45,12,85,-32,-89,39,69,44,42,1,6,8};
		
		   Arrays.sort(array);
		  for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	//	return java.util.Arrays.stream(nums).distinct().sorted().toArray(); 
		//Given an array of integers, write a method that returns an array that...
		//Has all duplicate elements removed.
		//Is sorted from least value to greatest value
	
		n+=array[i];
	}
		  System.out.println("Total sum " + n);
}
}
				
		


