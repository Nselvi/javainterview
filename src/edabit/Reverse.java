package edabit;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Reverse {

	public static void main(String[] args) {
		int[] arr = {1,4,7};
		System.out.println(reverse(arr));
	
		 
	}
	public static int[] reverse(int[] arr) {
		int[]arr2=new int[arr.length];
		int x=0;
		for(int i=arr.length-1;i>=0;i--) {
			arr2[x]=arr[i];
			x++;
		}	
		return arr2;
		
		
		// int[] result = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
	    //    return result;
	}
}
		
		
