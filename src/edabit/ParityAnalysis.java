package edabit;

public class ParityAnalysis {

	public static void main(String[] args) {
		int num = 3453;
		System.out.println(parityAnalysis(num));

	}

	public static boolean parityAnalysis(int num) {
		int sum = 0;
		int temp=num;
		if(num<10) {
			return true;
		}
		while (temp > 0) {
			sum += temp % 10;
			temp= temp / 10;
		}
		//System.out.println(num);
		if ((sum % 2 == 0 && num % 2 == 0) || (sum % 2 != 0 && num % 2 != 0)) {
			return true;
		}
		return false;
		// return (sum % 2) == (num % 2);
	}

}
