package FunctionAndMethods;

public class BinaryToDecimal {
	public static void main(String args[]) {
		int pow = 0;
		int dec= 0;
		int binary=11;
		while(binary>0) {
			int ld=binary % 10;
			dec = (int) (dec + ld * Math.pow(2, pow));
			pow = pow + 1;
			binary = binary / 10 ;
		}
		System.out.print(dec);
	}

}
