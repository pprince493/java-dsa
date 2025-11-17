package BitManipulation;

public class setIthBit {
	public static void main(String args[]) {
		int n=10;
		int i=2;
		int bitMask= 1<<i;
		n = n | bitMask;
		System.out.print(n);
	}
}
