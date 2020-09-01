package edabit;

public class OddishOrEvenish {

	public static void main(String[] args) {
		int num=433;
		System.out.println(oddishOrEvenish(num));
	}
	public static String oddishOrEvenish(int num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num=num/10;
		}
		//System.out.println(sum);
		return (sum%2==0)? "Evenish" :"Oddish" ;
		
			
	}
}
