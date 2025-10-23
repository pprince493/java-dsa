package ArraysTutorials;

public class LargestNumber {
	public static void main(String args[]) {
		int arr[]= {10,5,12,55,22,102,3,7,8,9};
		int largest= Integer.MIN_VALUE;
		int smallest= Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("Largest Number in array is : "+ largest);
		System.out.println("smallest Number in array is : "+ smallest);
	}

}
