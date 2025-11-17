package BitManipulation;

public class ClearlastIBits {
	public static void main(String args[]) {
		int n=15;
		int i=2;
		int bitMask = (~0)<<i;
		System.out.print(n & bitMask);
		
	}
}
