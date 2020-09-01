package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {

	public static void main(String args[]) {
		Integer x[] = { 4, 3, 2, 12, 54, 34, 88 };
		System.out.println(returnLargest(x, 7));
	}

	public static int returnLargest(Integer[] b, int total) {
		List<Integer> list1 = Arrays.asList(b);
		Collections.sort(list1);
		int largest = list1.get(total - 1);
		return largest;
		
		
	}

}
