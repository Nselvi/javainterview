package interview;

import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arr al=new Arr();
		//al.sortNumsAscending([1, 2, 10, 50, 5]nums);

	}
	
	public static int[] sortNumsAscending(int[] nums) {
		if(nums.length<1){
			return null;
		}else{
			Arrays.sort(nums);
   for (int i = 0; i < nums.length; i++) {
   //return nums[i];
	   System.out.println(nums[i]);
   }
		}
		return nums;
   
  }
}
