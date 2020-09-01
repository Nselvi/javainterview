package edabit;

public class oddsVsEvens {

	public static void main(String[] args) {
				
		System.out.println(OddsVsEvens(3454));
	}

	public static String OddsVsEvens(int num) {
		int odd = 0;
		int even = 0;
		int dig = 0;

		while (num > 0) {
			dig = num % 10;
			if (dig % 2 == 0) {
				even += dig;
			} else {
				odd += dig;
			}
			num = num / 10;
		}

		if (odd > even) {
			return "odd";
		} else if (even > odd) {
			return "even";
		} else {
			return "equal";
		}
	}
}
