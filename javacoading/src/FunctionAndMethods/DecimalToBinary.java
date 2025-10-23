package FunctionAndMethods;

public class DecimalToBinary {
	public static void main(String args[]) {
		int decimal = 3;
		int binary = 0;
		int pow =0;
		while(decimal > 0) {
			int r = decimal % 2;
			binary = (int) (binary + (r * Math.pow(10, pow)));
			pow = pow + 1;
			decimal = decimal / 2 ;
		}
		 System.out.print("Binary number is "+ binary);
	}
}
