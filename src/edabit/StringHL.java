package edabit;

import java.util.Arrays;

public class StringHL {

	public static void main(String[] args) {
		
		//highestAndLowest("1 2 3 4 5"); // return "5 1"

		String s= "7 1 -3 -2 4 -5";
		
		String[]arr=s.split(" ");
		int []intarr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			intarr[i]=Integer.parseInt(arr[i]);
		}
		Arrays.sort(intarr);
		System.out.println(intarr[intarr.length-1]+" "+intarr[0]);
		  
		}

	}


