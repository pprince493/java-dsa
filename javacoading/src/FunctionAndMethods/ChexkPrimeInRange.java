package FunctionAndMethods;

public class ChexkPrimeInRange {
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
	
	public static void main(String args[]) {
		int start = 2;
		int end = 15;
		System.out.print("Prime number is ");
		for(int i = start; i<= end; i++) {
			if(IsPrime(i)) {
				System.out.print(i + ",");
			}
		}
	}

}
