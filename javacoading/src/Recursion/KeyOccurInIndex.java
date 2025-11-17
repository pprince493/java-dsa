package Recursion;

public class KeyOccurInIndex {
	public static void main(String args[]) {
		int arr[] = {2,3,7,9,6,4,3,2,4,6};
		System.out.println(keyindex(arr,5,0));
	}
	public static int keyindex(int arr[], int key,int i) {
		if(i == arr.length - 1) {
			return -1;
		}
		if(arr[i]==key) {
			return i;
		}
		return keyindex(arr,5,i+1);
	}
}
