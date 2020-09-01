package interview;

public class Amstrong {

	public static void main(String[] args) {
		
		//153 = 13 + 53 + 33 (x=3, 3 basamakli)
		//n1x + n2x + n3x + nx-1x + nxx = n
		
		int sum = 0;
		int digit;
		int temp;
		int number = 370;
		temp = number;
		while (temp > 0) {
			digit = temp % 10;
			sum = sum + (digit * digit * digit);
			temp = temp / 10;
		}
		if (number == sum)
			System.out.println(number + " is an armstrong number");
	}

}
