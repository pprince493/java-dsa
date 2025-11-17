package BitManipulation;

public class getIthBit {
	public static void main(String args[]) {
		int n=10;
		int i=2;
		int bitMask = 1<<i;
		if((n & bitMask)==0) {
			System.out.print("0");
		}else {
			System.out.print("1");
		}
	}
}
