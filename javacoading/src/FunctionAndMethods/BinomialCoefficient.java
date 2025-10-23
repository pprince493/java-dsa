package FunctionAndMethods;

public class BinomialCoefficient {
	public static void main(String args[]) {
		int n=5;
		int r=2;
		int fact_n= factorial(n);
		int fact_r=factorial(r);
		int fact_nmr=factorial(n-r);
		int coefficient= fact_n / (fact_r * fact_nmr);
		System.out.print("coefficient of number is "+coefficient);
	}
	public static int factorial(int fact) {
		int f=1;
		for(int i=1;i<=fact;i++) {
			f=f*i;
		}
		return f;
	}

}
