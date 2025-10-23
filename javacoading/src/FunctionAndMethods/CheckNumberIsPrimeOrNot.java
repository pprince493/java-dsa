package FunctionAndMethods;

public class CheckNumberIsPrimeOrNot {
	public static void main(String args[]) {
		System.out.println(IsPrime(6));
	}
	public static boolean IsPrime(int number) {
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count=count+1;
			}
		}
		if(count<=2) {
			return true;
		}else return false;
	}

}
