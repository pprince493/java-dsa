package ArraysTutorials;

public class BinarySearch {   
	public static void main(String args[]) {
		int arr[]= {2,4,6,8,10,12,14,16,18,20};
		int key = 10;
		System.out.print("key in position of" + binarySearch(arr,key));
	}
	public static int binarySearch(int number[], int key) {
		int start=0;int end=number.length-1;
		while(start <= end) {
			int mid = (start + end) / 2;
			
			 if(number[mid] == key ) {
				 return mid;
			 }
			 if(number[mid] < key) {
				 start = mid + 1;
			 }else{
				 end = mid - 1;
			 }
		}
		return -1;
	}

}
