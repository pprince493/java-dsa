package BitManipulation;

public class CheckIfNumberIsPowerOfTwoOrNot {
	public static void main(String args[]) {
		int n=15;
		if((n & (n-1)) == 0) {
			System.out.print("true");
		}else {
			System.out.print("false");
		}
	}
}
