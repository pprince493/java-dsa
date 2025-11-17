package BitManipulation;

public class UpdateIthBit {
	public static void main(String args[]) {
		int n=10;
		int i=2;
		int newBit=0;
		if(newBit==0) {
			int bitMask= ~(1 << i);
			System.out.print(n & bitMask);
		}
		else {
			int bitMask= 1<<i;
			n = n | bitMask;
			System.out.print(n);

		}
	}
}
 