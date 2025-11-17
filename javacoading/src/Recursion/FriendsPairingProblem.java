package Recursion;

//totalWays = f(n-1) + (n-1) * f(n-2)

public class FriendsPairingProblem {
	public static void main(String args[]) {
		System.out.println(friendsPairing(3));
	}
	
	public static int friendsPairing(int n) {
		if(n==1 || n==2) {
			return n;
		}
		//single choice
		int fnm1 = friendsPairing(n-1);
		
		//pair
		int fnm2 = friendsPairing(n-2);
		int pairWays = (n-1) * fnm2;
		
		//totWays
		int totWays = fnm1 + pairWays;
		return totWays;
	}

}
