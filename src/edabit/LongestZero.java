package edabit;

public class LongestZero {

	public static void main(String[] args) {

	
		String str="01100001011000";
	
		System.out.println(longestZero(str));

	}
	public static String longestZero(String str) {
		
		int count = 0;
		 int largest = 0;
		  for (int i = 0; i < str.length(); i++) {
		    if (str.charAt(i) == 0) {
		      count++;
		    } else if (count > largest) {
		      largest = count;
		      count = 0;
		    }
		  }
		  if (count > largest) {
		    largest = count;
		  }
		//  return lar;
		return str;
		}
		
		
		/*
		  public static void main(String[] args) {
        int i = 38289701;
        System.out.println(Integer.toBinaryString(i));
 
        int count = consecutiveZeros(i);
        System.out.println("Consecutive zeros: " + count);
    }
 
    public static int consecutiveZeros(int n) {
 
        int max = Integer.numberOfLeadingZeros(0);
        int consecutive = 0;
        int currentCount = 0;
        while (Integer.numberOfLeadingZeros(n) != max) {
            if ((n & 1) == 0) {
                currentCount++;
            } else {
                if (currentCount > consecutive) {
                    consecutive = currentCount;
                }
                currentCount = 0;
            }
            n = n >> 1;
        }
        return consecutive;
    }
		 */
	}


