package ArraysTutorials;

public class ReverseAnArray {
	public static void main(String args[]) {
		int arr[] = {0,1,2,3,4,5,6,7,8,9};
		reverse(arr);
		System.out.print("Reverse Array is -------->");
		for(int i = 0; i< arr.length; i++){
		System.out.print(arr[i] + ",");
		}
	}
	public static void reverse(int number[]) {
		int start= 0;
		int end = number.length-1;
		while(start <= end) {
			if(start == end) return;
			
			if(start < end) {
				int temp = number[start];
				number[start] = number[end];
				number[end] = temp;
				start++;
				end--;
			}
		}
	}

}
