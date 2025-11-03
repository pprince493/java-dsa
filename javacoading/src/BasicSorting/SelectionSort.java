package BasicSorting;

public class SelectionSort {
	public static void main(String args[]) {
		int arr[] = {5,4,3,2,1};
		selectionsort(arr);
		System.out.print("sorted array is = ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	public static void selectionsort(int number[]) {
		for(int i=0;i<number.length-1;i++) {
			int minpos=i;
			for(int j=i+1;j<number.length;j++) {
				if(number[minpos]>number[j]) {
					minpos=j;
				}
			}
			int temp=number[minpos];
			number[minpos]=number[i];
			number[i]= temp;
		}
	}

}
