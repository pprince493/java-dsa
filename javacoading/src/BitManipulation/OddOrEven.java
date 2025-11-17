package BitManipulation;

public class OddOrEven {
	public static void main(String args[]) {
		int n= 110101010;
		int bitMask=1;
		if((n & bitMask) == 0) {
			System.out.print("number is even");	
		}else {
			System.out.print("number is odd");
		}
		
	}
}
