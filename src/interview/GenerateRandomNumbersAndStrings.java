package interview;

import java.util.Arrays;
import java.util.Random;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
		
		Random rand=new Random();
		
		int rand_num=rand.nextInt(100);
		System.out.println(rand_num);
		
		
		double rand_dbl=rand.nextDouble();
		System.out.println(rand_dbl);
		
	//Approach 2-Math
		System.out.println(Math.random());
		
		//Approach 3-Apache commons-lang API Not:Jar File eklenecek 
		//String ranNumber=RandomStringUtils.randomNumeric(10);
		//System.out.println(ranNumber);
		
		int a1[]= {1,2,3,4};
		int a2[]= {1,2,3,4};
		boolean result=Arrays.equals(a1, a2);
		
		System.out.println(result);
		
	}

}
