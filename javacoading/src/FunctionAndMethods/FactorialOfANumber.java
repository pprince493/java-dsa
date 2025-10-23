package FunctionAndMethods;

public class FactorialOfANumber {
	public static void main(String args[]) {
		int fact=4;
		int factValue= factorial(fact);
		System.out.print("factorial of number is "+factValue);
	}
	
	public static int factorial(int fact) {
		int f=1;
		for(int i=1;i<=fact;i++) {
			f= f * i;
		}
		return f;
	}

}
