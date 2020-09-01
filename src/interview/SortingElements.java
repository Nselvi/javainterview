package interview;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {

		int a[] = { 40, 20, 10, 50, 30 };
		Integer b[]= {4,2,5,6,9,8};

		System.out.println("Before sorting " + Arrays.toString(a));	
//		Arrays.parallelSort(a);	
//		System.out.println("After sorting" + Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("After sorting " + Arrays.toString(a));
		
	
		Arrays.sort(b, Collections.reverseOrder());  // Integer kabul ediyor. int degil.
		System.out.println(Arrays.toString(b));
		

	}

}
