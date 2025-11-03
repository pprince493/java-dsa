package BasicSorting;

public class InsertionSort {
	public static void main(String args[]) {
		int arr[]= {5,4,1,3,2};
		insertionsort(arr);
		System.out.print("sorted array is = ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	public static void insertionsort(int number[]) {
		for(int i=1;i<number.length;i++) {
			int curr=number[i];
			int prev=i-1;
			//finding out the correct pos to insert
			while(prev>=0 && number[prev] > curr) {
				number[prev+1] = number[prev];
				prev--;
			}
			// insertion
			number[prev+1] = curr;
		}
	}

}
