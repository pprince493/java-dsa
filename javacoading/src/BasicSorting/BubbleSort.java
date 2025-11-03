package BasicSorting;

public class BubbleSort {
	public static void main(String args[]) {
		int arr[] = {5,4,3,2,1};
		BubbleSort(arr);
		System.out.print("Sort array is = ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	public static void BubbleSort(int number[]) {
		for(int i=0;i<number.length-1;i++) {
			for(int j=0;j<number.length-1-i;j++) {
				if(number[j]>number[j+1]) {
					int temp=number[j+1];
					number[j+1] = number[j];
					number[j]= temp;
				}
			}
		}
	}

}
