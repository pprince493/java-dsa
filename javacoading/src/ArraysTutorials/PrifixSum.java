package ArraysTutorials;

public class PrifixSum {
	public static void main(String args[]) {
		int arr[] = {2,4,6,8,9,10};
		prifixsum(arr);
	}
	
	public static void prifixsum(int number[]) {
		int currentSum=0;
		int maxSum = Integer.MIN_VALUE;
		int prifix[] = new int[number.length];
		
		prifix[0]=number[0];
		//calculate prifix array
		for(int i =1; i<prifix.length; i++) {
			prifix[i] = prifix[i-1] + number[i];
		}
		
		
		for(int i=0;i<number.length;i++) {
			for(int j=i;j<number.length;j++) {
				currentSum = i == 0 ? prifix[j] : prifix[j] - prifix[i-1] ;
				
				if(currentSum > maxSum) {
					maxSum = currentSum;
				}
			}
		}
		System.out.println("Max sum of sub Arrays is "+ maxSum);
	}

}
