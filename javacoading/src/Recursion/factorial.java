package Recursion; 

public class factorial {
	public static void main(String args[]) {
		System.out.println(factorialcal(5));
	}
	public static int factorialcal(int n) {
		if(n==0) {
			return 1;
		}
		int fn = n * factorialcal(n-1);
		return fn;
		
	}
}
  