package ArraysTutorials;

public class MaxSubArraySum {
	public static void main(String args[]) {
		
			int arr[] = {2,4,6,8,10};
			
			System.out.println("Amx Sub Array Sum is like--> " +subarrays(arr));
	}
		
		public static int subarrays(int number[]) {
			int max = Integer.MIN_VALUE;
			for(int i=0; i<number.length; i++) {
				if(number[i]>max) {
				max=number[i];
				}
				for(int j=i+1 ; j<number.length; j++) {
					int subarrmax=0;
					for(int k=i;k<=j;k++) {
						subarrmax=subarrmax + number[k];
					}
					if(subarrmax > max) {
						max=subarrmax;
					}
				
				}
			
				}
			return max;
			
		}
}


