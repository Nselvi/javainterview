package edabit;

public class RightTriangle {

	public static void main(String[] args) {
		int x = -3;
		int y = 4;
		int z = 5;
		System.out.println(rightTriangle(x, y, z));

	}

	public static boolean rightTriangle(int x, int y, int z) {
		if(x>0 && y>0 && z>0) {
			if (z > x && z > y) {
				return (x * x + y * y == z * z);
			} else if (y > x && y > z) {
				return (x * x + z * z == y * y);
			} else if (x > y && x > z) {
				return (y * y + z * z == x * x);
			}else {
				return false;	
		}
		 
		}
		return false;

	}
}


/*
if (x <= 0 || y <= 0 || z <= 0) {
			return false;
		}
		return isRightTriangle(x, y, z) || isRightTriangle(x, z, y)
			|| isRightTriangle(y, z, x);
  }
	
	private static boolean isRightTriangle(int a, int b, int c) {
		return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
	}
}

*/