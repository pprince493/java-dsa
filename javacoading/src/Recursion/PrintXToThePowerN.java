package Recursion;

public class PrintXToThePowerN {
	public static void main(String args[]) {
		int x=2;
		int n=10;
		System.out.println(printresult(x,n));
		recurssion(n);
	}
	public static int printresult(int x, int n) {
		if(n==0) {
			return 1;
		}
		int result = x * printresult(x, n-1);
		return result;
	}
	public static void recurssion(int n) {
		if(n >0) {
			recurssion(n-1);
			System.out.println(n);
		}
		
	}
}
