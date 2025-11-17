package Recursion;

public class ArrayIsSortedOrNot {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,8};
		System.out.println(isarraysorted(arr,0));
	}
	public static Boolean isarraysorted(int arr[],int i) {
		if(arr.length-1 == i) {
			return true;
		}
		if(arr[i] > arr[i+1]) {
			return false;
		}
		return isarraysorted(arr,i+1);
	}
}
