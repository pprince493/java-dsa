package Recursion;

public class KeyOccurInLastIndex {
	public static void main(String args[]) {
		int arr[] = {2,5,3,7,9,6,4,3,5,2,4,6};
		System.out.println(keyindex(arr,5,arr.length-1));
	}
	public static int keyindex(int arr[], int key,int i) {
		if(i < 0) {
			return -1;
		}
		if(arr[i]==key) {
			return i;
		}
		return keyindex(arr,5,i-1);
	}
}
