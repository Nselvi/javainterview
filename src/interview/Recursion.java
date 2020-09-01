package interview;

public class Recursion {

	public static void main(String[] args) {

		Recursion r = new Recursion();

		System.out.println(r.factorial(4));

	}

	public int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);

//  int n=4;
//  int res=1;
//  for(int i=1; i<=n; i++) {
//	  res*=i;
//  }
//  System.out.println(res);
	}
}
