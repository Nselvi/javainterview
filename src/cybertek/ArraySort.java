package cybertek;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
//Create a method that will accept an ArrayList and sort the ArrayList into ascending order 
		//Do not use any ready method  ???BAK
 
		//4,1,4,5,2,3,1
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,4,4,5,2,3,1));
		System.out.println(sortlist(list));
	}
	public static ArrayList<Integer> sortlist(ArrayList<Integer>list) {
		
		for(int i=0; i<list.size();i++) {
			for(int j=0; j<list.size();j++) {
				
				if(list.get(i)<list.get(j)) {
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					
				}
			}
		}
		return list;
		
		
	}

}
