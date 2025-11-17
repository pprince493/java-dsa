package Recursion;

public class TillingProblem {
	public static void main(String args[]) {
		System.out.println(tillingproblem(3));
	}
	public static int tillingproblem(int n){
		//base
		if(n==0 ||n==1) {
			return 1;
		}
		//choise
		//vertical choice
		int fnm1 = tillingproblem(n-1);
		
		//horizontal choice
		int fnm2 = tillingproblem(n-2);
		
		int totalways = fnm1 + fnm2;
		
		return totalways;
	}
	
}
