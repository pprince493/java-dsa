package DivideAndConquer;

public class SortedAndRotatedCode {
	public static void main(String args[]) {
		int arr[] = {4, 5, 6, 7, 0, 1, 2};
		int target=0;
		System.out.println(searchindeax(arr, target, 0,arr.length-1));
	}
	public static int searchindeax(int arr[],int tar, int si,int ei) {
		if(si>ei) {
			return -1;
		}
		int mid = si + (ei-si)/2;
		if(arr[mid] == tar) {
			return mid;
		}
		
		// mid on L1
		if(arr[si] <= arr[mid]) {
			// case a : left
			if(arr[si] <= tar && tar <= arr[mid]) {
				return searchindeax(arr,tar,si,mid-1);
			}else {
				//case b:right
				return searchindeax(arr,tar,mid+1,ei);
			}
		}else {
			//case c: right
			if(arr[mid]<=tar && tar<=arr[ei]) {
				return searchindeax(arr,tar,mid+1,ei);
			}else {
				return searchindeax(arr,tar,si,mid-1);
			}
		}
		
		
	}
}
