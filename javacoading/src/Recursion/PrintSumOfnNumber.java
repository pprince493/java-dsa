package Recursion;

public class PrintSumOfnNumber {
	public static void main(String args[]) {
		System.out.println(sumofnumber(2));
	}
	
	public static int sumofnumber(int n){
		if(n==0) {
			return 0;
		}
		int sum = n + sumofnumber(n-1);
		
		return sum;
	}
}
