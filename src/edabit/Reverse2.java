package edabit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse2 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 775, 40, 50 };
		System.out.println(reverse(arr));

	}

	public static int[] reverse(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int text : arr) {
			list.add(text);
			
		}
		Collections.reverse(list);

		Integer[] arr1 = new Integer[list.size()];

		for (int i = 0; i < list.size(); i++) {
			
			arr1[i] = list.get(i);
		}
		return arr;

	

	}
}


