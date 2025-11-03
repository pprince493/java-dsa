package ArraysTutorials;

public class KadanesAlgorithmMaxSubArrays {
	public static void main(String args[]) {
		int arr[] = {-2,4,-9,10,14,18,-19,-2,2};
		kadanes(arr);
	}
	
	public static void kadanes(int number[]) {
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		
		for(int i=0; i<number.length;i++) {
			curSum += number[i];
			if(curSum<0) {
				curSum = 0;
			}
			maxSum = Math.max(maxSum, curSum);
		}
		System.out.println("max SubArray sum is -> " + maxSum);
		
	}

}
